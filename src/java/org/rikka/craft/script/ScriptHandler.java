package org.rikka.craft.script;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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

@SideOnly(Side.SERVER)
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
        enabled = compound.getBoolean("enabled");
        language = compound.getString("language");
        script = compound.getString("inner");
        console = compound.getString("console");
        String[] files = compound.getString("files").split(",");
        for (String file : files) {
            if (file != null && !file.isEmpty() && file.endsWith(suffix)) {
                scriptFiles.add(file);
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setBoolean("enabled", enabled);
        compound.setString("language", language);
        compound.setString("inner", script);
        compound.setString("console", console);
        String files = "";
        for (String file : scriptFiles) {
            files = files + file + ",";
        }
        compound.setString("files", files);
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
