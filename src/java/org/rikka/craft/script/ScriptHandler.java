package org.rikka.craft.script;

import net.minecraft.nbt.*;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.craft.data.CraftData;
import org.rikka.data.Data;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class ScriptHandler implements IScriptHandler {

    private final Data tData = new CraftData();
    private final Data sData = new CraftData();

    private long lastCreated = 0L, lastPlayerUpdate = 0L;
    private boolean enabled = false;
    private boolean errored = false;
    private boolean inited = false;
    private boolean engineInited = false;
    private boolean evalInited = false;

    private String language = "ECMAScript", script = "", console = "", fullscript = "", suffix = ".js";

    private List<String> scriptFiles = new ArrayList<>();
    private List<Integer> unknownFunctions = new ArrayList<>();
    /* 执行脚本之前 setEngine 并 initEngine */
    private ScriptEngine engine;
    /* 构造时调用 setObject 初始化 */
    private Object object;
    private boolean scriptInited;


    private boolean initEngine() {
        if (!inited) {
            engine = ScriptManager.getEngineByName(language);
            suffix = ScriptManager.getSuffixByName(language);
            if (engine == null) {
                errored = true;
                return false;
            }
            initScript();
            inited = true;
        }
        return true;
    }

    private void initScript() {
        if (!scriptInited) {
            fullscript = "";
            if (script != null && !script.isEmpty()) {
                fullscript = script + "\n";
            }
            for (String filename : scriptFiles) {
                String code = ScriptManager.fileScriptMap.get(filename);
                if (code != null && !code.isEmpty()) {
                    fullscript = fullscript + code + "\n";
                }
            }
            scriptInited = true;
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        /*SData*/
        {
            NBTTagCompound comp = compound.getCompoundTag("SData");
            sData.clear();
            for (String key : comp.getKeySet()) {
                NBTBase base = comp.getTag(key);
                if (base instanceof NBTTagByte) {
                    sData.put(key, ((NBTTagByte) base).getByte() != 0);
                } else if (base instanceof NBTTagInt) {
                    sData.put(key, ((NBTTagInt) base).getInt());
                } else if (base instanceof NBTTagShort) {
                    sData.put(key, ((NBTTagShort) base).getShort());
                } else if (base instanceof NBTTagLong) {
                    sData.put(key, ((NBTTagLong) base).getLong());
                } else if (base instanceof NBTTagFloat) {
                    sData.put(key, ((NBTTagFloat) base).getFloat());
                } else if (base instanceof NBTTagDouble) {
                    sData.put(key, ((NBTTagDouble) base).getDouble());
                } else if (base instanceof NBTTagString) {
                    sData.put(key, ((NBTTagString) base).getString());
                }
            }
        }
        /*Script*/
        {
            NBTTagCompound comp = compound.getCompoundTag("Script");
            enabled = comp.getBoolean("enabled");
            language = comp.getString("language");
            script = comp.getString("inner");
            console = comp.getString("console");
            String[] files = comp.getString("files").split(",");
            for (String file : files) {
                if (file != null && !file.isEmpty() && file.endsWith(suffix)) {
                    scriptFiles.add(file);
                }
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        /*SData*/
        {
            NBTTagCompound comp = new NBTTagCompound();
            for (String key : sData.keySet()) {
                Object value = sData.get(key);
                if (value instanceof Boolean) {
                    comp.setBoolean(key, (Boolean) value);
                } else if (value instanceof Integer) {
                    comp.setInteger(key, (Integer) value);
                } else if (value instanceof Short) {
                    comp.setShort(key, (Short) value);
                } else if (value instanceof Long) {
                    comp.setLong(key, (Long) value);
                } else if (value instanceof Float) {
                    comp.setFloat(key, (Float) value);
                } else if (value instanceof Double) {
                    comp.setDouble(key, (Double) value);
                } else if (value instanceof String) {
                    comp.setString(key, (String) value);
                }
            }
            compound.setTag("SData", comp);
        }
        /*Script*/
        {
            NBTTagCompound comp = new NBTTagCompound();
            comp.setBoolean("enabled", enabled);
            comp.setString("language", language);
            comp.setString("inner", this.script);
            comp.setString("console", console);
            String files = "";
            for (String file : scriptFiles) {
                files = files + file + ",";
            }
            comp.setString("files", files);
            compound.setTag("Script", comp);
        }
        return compound;
    }

    @Override
    public void run(ScriptType type, Event event) {

        if (enabled && initEngine()) {
            if (ScriptManager.lastLoaded > this.lastCreated) {
                this.lastCreated = ScriptManager.lastLoaded;
                evalInited = false;
            }
            StringWriter writer = new StringWriter();
            PrintWriter printer = new PrintWriter(writer);
            this.engine.getContext().setWriter(printer);
            this.engine.getContext().setErrorWriter(printer);

            try {
                if (!evalInited) {
                    try {
                        engine.eval(fullscript);
                        if (language.contains("lua")) this.engine.put("event", event);
                        evalInited = true;
                    } catch (ScriptException e) {
                        errored = true;
                        return;
                    }
                }
                if (engine instanceof Invocable) {
                    ((Invocable) engine).invokeFunction(type.function, event);
                } else {
                    Object func = this.engine.get(type.function);
                    if (func != null) {
                        Method method = func.getClass().getMethod("call");
                        method.invoke(func);
                    } else {
                        unknownFunctions.add(type.ordinal());
                    }
                }
            } catch (NoSuchMethodException e) {
                unknownFunctions.add(type.ordinal());
            } catch (Exception e) {
                errored = true;
                e.printStackTrace(printer);
                //NoppesUtilServer.NotifyOPs(handler.noticeString() + " script errored");
            }
            //this.appendConsole(writer.getBuffer().toString().trim());
            printer.close();
        }
    }

    @Override
    public boolean getEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language.toLowerCase();
    }

    @Override
    public final Data getTData() {
        return tData;
    }

    @Override
    public final Data getSData() {
        return sData;
    }

    @Override
    public final Object getObject() {
        return object;
    }

    @Override
    public void setObject(Object object) {
        this.object = object;
    }
}
