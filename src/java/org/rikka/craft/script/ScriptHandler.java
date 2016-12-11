package org.rikka.craft.script;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.craft.data.CraftData;
import org.rikka.data.Data;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ScriptHandler implements IScriptHandler {

    private final Data tData = new CraftData();
    private final Data sData = new CraftData();
    private Object object = null;
    private boolean enabled = false;
    private boolean errored = false;
    private boolean inited = false;
    private boolean isClient = true;
    private String language = "ECMAScript";
    private List<String> scriptFiles = new ArrayList<>();
    private String script = "function", console = "console", fullscript = "full", suffix = ".js";
    private ScriptEngine engine = null;


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        // <String>inner <String>files <String>console
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
        if (this.enabled) {
            if (!inited) {
                scriptFiles.clear();
            }
            if (!errored) {
                setEngine(language);
                if (engine != null) {
                    try {
                        if (!inited) {
                            engine.eval(fullscript);
                            inited = true;
                        }
                        if (this.engine.getFactory().getLanguageName().equals("lua")) {
                            Object e = this.engine.get(type.function);
                            if (e != null) {
                                this.engine.put("event", event);
                                Method m = e.getClass().getMethod("call");
                                m.invoke(e);
                            } else {
                                //this.unknownFunctions.add(type.ordinal());
                            }
                        } else {
                            ((Invocable) this.engine).invokeFunction(type.function, event);
                        }
                    } catch (NoSuchMethodException var8) {
                        //this.unknownFunctions.add(type.ordinal());
                    } catch (Exception var9) {
                        this.errored = true;
                        //var9.printStackTrace(pw);
                        //NoppesUtilServer.NotifyOPs(handler.noticeString() + " script errored");
                    }
                }
            }
        }
    }

    private void setEngine(String language) {
        if (this.language == null || !this.language.equals(language)) {
            this.engine = ScriptManager.getEngineByName(language);
            if (this.engine == null) {
                this.errored = true;
            } else {
                //this.engine.put("AnimationType", animations);
                //this.engine.put("EntityType", entities);
                //this.engine.put("RoleType", roles);
                //this.engine.put("JobType", jobs);
                //this.engine.put("SideType", sides);
                //this.engine.put("TacticalVariantType", tacticalVariantTypes);
                //this.engine.put("PotionEffectType", potionEffectTypes);
                //this.engine.put("ParticleType", particleTypes);
                this.language = language;
                this.inited = false;
            }
        }
    }

    @Override
    public boolean isClient() {
        if (object instanceof Entity) {
            return ((Entity) object).getEntityWorld().isRemote;
        } else if (object instanceof TileEntity) {
            return ((TileEntity) object).getWorld().isRemote;
        } else if (object instanceof World) {
            return ((World) object).isRemote;
        }
        return true;
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
        this.language = language;
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
