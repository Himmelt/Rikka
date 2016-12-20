package org.rikka.craft.script;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.Rikka;
import org.rikka.craft.data.CraftData;
import org.rikka.data.IData;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * The type Script handler.
 */
public class ScriptHandler implements IScriptHandler {

    private final IData tData = new CraftData();
    private final IData sData = new CraftData();
    private boolean inited = false;
    private boolean evaled = false;
    private boolean editing = false;
    private boolean enabled = false;
    private boolean errored = false;
    private long LASTLOAD = 0L;
    private String engineName, script, fullscript;
    private Rikka rikka;
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
        LASTLOAD = System.currentTimeMillis();
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

    private void updateHandlers() {
        if (rikka instanceof EntityPlayer) {
            if (enabled) ScriptManager.playerHandlers.put(rikka.hashCode(), this);
            else ScriptManager.playerHandlers.remove(rikka.hashCode());
        } else if (rikka instanceof Entity) {
            if (enabled) ScriptManager.entityHandlers.put(rikka.hashCode(), this);
            else ScriptManager.entityHandlers.remove(rikka.hashCode());
        } else if (rikka instanceof TileEntity) {
            if (enabled) ScriptManager.tileHandlers.put(rikka.hashCode(), this);
            else ScriptManager.tileHandlers.remove(rikka.hashCode());
        } else if (rikka instanceof World) {
            if (enabled) ScriptManager.worldHandlers.put(rikka.hashCode(), this);
            else ScriptManager.worldHandlers.remove(rikka.hashCode());
        }
    }

    @Override
    public void reload() {
        inited = false;
        evaled = false;
        /* enabled */
        errored = false;
        /* engineName */
        /* script */
        /* scriptFiles */
        unknowns.clear();
    }

    @Override
    public void run(EnumHook hook, Event event) {
        if (!editing && enabled && !errored && initEngine()) {
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
                    ((Invocable) engine).invokeFunction(hook.name(), event);
                } else {
                    Object func = this.engine.get(hook.name());
                    if (func != null) {
                        Method method = func.getClass().getMethod("call");
                        method.invoke(func);
                    } else {
                        unknowns.add(hook.ordinal());
                    }
                }
            } catch (NoSuchMethodException | ScriptException | IllegalAccessException | InvocationTargetException e) {
                errored = true;
                if (e instanceof NoSuchMethodException) unknowns.add(hook.ordinal());
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
        updateHandlers();
    }

    @Override
    public String getEngineName() {
        return engineName;
    }

    @Override
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public IData getTData() {
        return tData;
    }

    @Override
    public IData getSData() {
        return sData;
    }

    @Override
    public Rikka getRikka() {
        return rikka;
    }

    @Override
    public void setRikka(Rikka rikka) {
        this.rikka = rikka;
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
        updateHandlers();
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

    @Override
    public boolean isEditing() {
        return editing;
    }

    @Override
    public void setEditing(boolean editing) {
        this.editing = editing;
    }

}
