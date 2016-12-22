package org.rikka.craft.capability;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import org.apache.commons.io.FileUtils;
import org.rikka.event.REvent;
import org.rikka.handler.IScriptHandler;

import javax.annotation.Nullable;
import javax.script.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScriptHandler implements IScriptHandler, ICapabilitySerializable<NBTTagCompound> {
    @CapabilityInject(IScriptHandler.class)
    public static Capability<IScriptHandler> CAP;
    private static long LASTLOAD = 0L;
    private static final Map<String, String> fileScripts = new HashMap<>();
    private static final Map<String, String> engineLanguages = new HashMap<>();
    private static final Map<String, ScriptEngineFactory> engineFactories = new HashMap<>();
    private static final ResourceLocation NBT = new ResourceLocation("rikka:Script");
    /* 加载服务器时初始化 */
    public static final Map<Integer, IScriptHandler> worldHandlers = new HashMap<>();
    public static final Map<Integer, IScriptHandler> playerHandlers = new HashMap<>();
    public static File scriptFolder;
    public static boolean STARTED = false;
    /* 以上为静态变量 */
    private boolean inited = false;
    private boolean evaled = false;
    private boolean editing = false;
    private boolean enabled = false;
    private boolean errored = false;
    private long lastload = 0L;
    private String engineName, script, fullscript;
    private ScriptEngine engine;
    private List<String> scriptList = new ArrayList<>();
    private List<Integer> unknowns = new ArrayList<>();

    static {
        for (ScriptEngineFactory factory : new ScriptEngineManager().getEngineFactories()) {
            String engineName = factory.getEngineName().toLowerCase();
            if (engineName.contains("nashorn")) {
                engineFactories.put("Nashorn", factory);
                engineLanguages.put("Nashorn", "javascript");
            } else if (engineName.contains("lua")) {
                engineFactories.put("Luaj", factory);
                engineLanguages.put("Luaj", "lua");
            } else if (engineName.contains("jython")) {
                engineFactories.put("Jython", factory);
                engineLanguages.put("Jython", "python");
            } else if (engineName.contains("ruby")) {
                engineFactories.put("JRuby", factory);
                engineLanguages.put("JRuby", "ruby");
            } else {
                engineFactories.put(factory.getEngineName(), factory);
                engineLanguages.put(factory.getEngineName(), factory.getLanguageName());
            }
        }

    }

    private ScriptHandler(String type, int hash) {
        if (type.equals("world")) worldHandlers.put(hash, this);
        else if (type.equals("player")) playerHandlers.put(hash, this);
    }

    private ScriptHandler() {
    }

    @Override
    public void run(REvent event) {
        if (!editing && enabled && !errored && initEngine()) {
            if (LASTLOAD > lastload) {
                lastload = LASTLOAD;
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
                    ((Invocable) engine).invokeFunction(event.hook(), event);
                } else {
                    Object func = this.engine.get(event.hook());
                    if (func != null) {
                        Method method = func.getClass().getMethod("call");
                        method.invoke(func);
                    } else {
                        //unknowns.add(hook.ordinal());
                    }
                }
            } catch (NoSuchMethodException | ScriptException | IllegalAccessException | InvocationTargetException e) {
                errored = true;
                //if (e instanceof NoSuchMethodException) unknowns.add(hook.ordinal());
                e.printStackTrace(printer);
                /* 通知OP */
            }
            /* 写入控制台 */
            printer.close();
        }
    }

    @Override
    public String getScript() {
        return script;
    }

    @Override
    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public List<String> getList() {
        return scriptList;
    }

    private boolean initEngine() {
        if (!inited) {
            engine = getEngine(engineName);
            if (engine == null) {
                return false;
            }
            initScript();
            inited = true;
        }
        lastload = System.currentTimeMillis();
        return true;
    }

    private void initScript() {
        fullscript = "";
        if (script != null && !script.isEmpty()) {
            fullscript = script + "\n";
        }
        for (String filename : scriptList) {
            String code = fileScripts.get(filename);
            if (code != null && !code.isEmpty()) {
                fullscript = fullscript + code + "\n";
            }
        }
        evaled = false;
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
        this.engineName = engineName;
    }

    @Override
    public boolean isEditing() {
        return editing;
    }

    @Override
    public void setEditing(boolean editing) {
        this.editing = editing;
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return CAP.equals(capability);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return CAP.equals(capability) ? (T) this : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound comp = new NBTTagCompound();
        if (script != null && !script.isEmpty())
            comp.setString("script", script);
        comp.setBoolean("enabled", enabled);
        if (engineName != null && !engineName.isEmpty())
            comp.setString("engineName", engineName);
        String files = "";
        for (String name : scriptList) {
            files = files + name + ",";
        }
        if (!files.isEmpty())
            comp.setString("files", files);
        return comp;
    }

    @Override
    public void deserializeNBT(NBTTagCompound comp) {
        script = comp.getString("script");
        enabled = comp.getBoolean("enabled");
        engineName = comp.getString("engineName");
        String[] files = comp.getString("files").split(",");
        for (String name : files) {
            if (!name.isEmpty()) {
                scriptList.add(name);
            }
        }
    }

    public static void reload() {
        if (!scriptFolder.exists() && scriptFolder.mkdir()) {
            // 未成功创建
            System.out.println("Folder was not created!");
        }
        // clear data
        fileScripts.clear();
        for (String engineName : engineFactories.keySet()) {
            File langFolder = new File(scriptFolder, engineName.toLowerCase());
            if (!langFolder.exists() && langFolder.mkdir()) {
                // 创建失败
                System.out.println("Folder was not created!");
            }
            load(langFolder);
        }
        LASTLOAD = System.currentTimeMillis();
    }

    private static void load(File folder) {
        File[] files = folder.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    load(file);
                } else {
                    fileScripts.put(file.getName(), format(file));
                }
            }
        }
    }

    private static String format(File file) {
        try {
            return FileUtils.readFileToString(file, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static ScriptEngine getEngine(String engineName) {
        ScriptEngineFactory factory = engineFactories.get(engineName);
        return factory == null ? null : factory.getScriptEngine();
    }

    public static void attachEntity(AttachCapabilitiesEvent<Entity> event) {
        Entity entity = event.getObject();
        if (entity instanceof EntityPlayerMP) {
            event.addCapability(NBT, new ScriptHandler("player", entity.hashCode()));
        } else if (entity instanceof EntityCreature) {
            event.addCapability(NBT, new ScriptHandler());
        }
    }

    public static void attachWorld(AttachCapabilitiesEvent<World> event) {
        World world = event.getObject();
        if (world instanceof WorldServer) {
            event.addCapability(NBT, new ScriptHandler("world", world.hashCode()));
        }
    }
}
