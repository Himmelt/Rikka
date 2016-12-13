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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class ScriptHandler implements IScriptHandler {

    private final Data tData = new CraftData();
    private final Data sData = new CraftData();
    private boolean inited = false;
    private boolean evaled = false;
    private boolean enabled = false;
    private boolean errored = false;
    private long LASTLOAD = 0L;
    private String engineName, script, fullscript;
    private Object object;
    private ScriptEngine engine;
    private List<String> scriptFiles = new ArrayList<>();
    private List<Integer> unknowns = new ArrayList<>();


    private boolean initEngine() {
        if (!inited) {
            engine = ScriptManager.getEngine(engineName);
            if (engine == null) {
                return false;
            }
            initScript();
            inited = true;
        }
        return true;
    }

    private void initScript() {
        fullscript = "";
        if (script != null && !script.isEmpty()) {
            fullscript = script + "\n";
        }
        for (String filename : scriptFiles) {
            String code = ScriptManager.scriptFiles.get(filename);
            if (code != null && !code.isEmpty()) {
                fullscript = fullscript + code + "\n";
            }
        }
        evaled = false;
    }


    @Override
    public void reload() {
        inited = false;
        evaled = false;
        /* enabled */
        errored = false;
        LASTLOAD = System.currentTimeMillis();
        /* engineName */
        /* script */
        /* scriptFiles */
        unknowns.clear();
    }

    @Override
    public void run(ScriptType type, Event event) {
        if (enabled && !errored && initEngine()) {
            if (ScriptManager.LASTLOAD > this.LASTLOAD) {
                this.LASTLOAD = ScriptManager.LASTLOAD;
                initScript();
            }
            StringWriter writer = new StringWriter();
            PrintWriter printer = new PrintWriter(writer);
            this.engine.getContext().setWriter(printer);
            this.engine.getContext().setErrorWriter(printer);
            try {
                if (!evaled) {
                    engine.eval(fullscript);
                    if (engineName.toLowerCase().contains("lua")) this.engine.put("event", event);
                    evaled = true;
                }
                if (engine instanceof Invocable) {
                    ((Invocable) engine).invokeFunction(type.function, event);
                } else {
                    Object func = this.engine.get(type.function);
                    if (func != null) {
                        Method method = func.getClass().getMethod("call");
                        method.invoke(func);
                    } else {
                        unknowns.add(type.ordinal());
                    }
                }
            } catch (NoSuchMethodException | ScriptException | IllegalAccessException | InvocationTargetException e) {
                errored = true;
                if (e instanceof NoSuchMethodException) unknowns.add(type.ordinal());
                e.printStackTrace(printer);
                /* 通知OP */
            }
            /* 写入控制台 */
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
    public String getEngineName() {
        return engineName;
    }

    @Override
    public void setEngineName(String engineName) {
        this.engineName = engineName.toLowerCase();
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
            script = comp.getString("script");
            enabled = comp.getBoolean("enabled");
            engineName = comp.getString("engineName");
            String[] files = comp.getString("files").split(",");
            for (String file : files) {
                if (file != null && !file.isEmpty()) {
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
            if (script != null && !script.isEmpty())
                comp.setString("script", script);
            comp.setBoolean("enabled", enabled);
            if (engineName != null && !engineName.isEmpty())
                comp.setString("engineName", engineName);
            String files = "";
            for (String file : scriptFiles) {
                files = files + file + ",";
            }
            if (!files.isEmpty())
                comp.setString("files", files);
            compound.setTag("Script", comp);
        }
        return compound;
    }

}
