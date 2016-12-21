package org.rikka.craft.script;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import org.apache.commons.io.FileUtils;
import org.rikka.craft.capability.ScriptProvider;
import org.rikka.craft.data.CraftData;
import org.rikka.craft.data.GSData;
import org.rikka.craft.entity.CraftPlayer;
import org.rikka.craft.tile.CraftTileEntity;
import org.rikka.craft.world.CraftWorld;
import org.rikka.data.IData;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ScriptManager {

    @CapabilityInject(IScriptHandler.class)
    public static Capability<IScriptHandler> capability;
    private static final IData gtData = new CraftData();
    private static final IData gsData = new GSData();
    public static long LASTLOAD = 0L;
    public static boolean STARTED = false;
    public static final Map<String, String> scriptFiles = new HashMap<>();
    public static final Map<Integer, IScriptHandler> tileHandlers = new HashMap<>();
    public static final Map<Integer, IScriptHandler> worldHandlers = new HashMap<>();
    public static final Map<Integer, IScriptHandler> entityHandlers = new HashMap<>();
    public static final Map<Integer, IScriptHandler> playerHandlers = new HashMap<>();
    private static final Map<String, String> engineLanguages = new HashMap<>();
    private static final Map<String, ScriptEngineFactory> engineFactories = new HashMap<>();
    private static File scriptFolder;

    private static final ResourceLocation location = new ResourceLocation("rikka:capScript");

    private static void loadFiles(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    loadFiles(file);
                } else {
                    try {
                        scriptFiles.put(file.getName(), FileUtils.readFileToString(file));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void init(File saveFolder) {
        scriptFolder = new File(saveFolder, "scripts");
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

    public static void reload() {
        if (!scriptFolder.exists() && scriptFolder.mkdir()) {
            // 未成功创建
            System.out.println("Folder was not created!");
        }
        // clear data
        scriptFiles.clear();
        for (String engineName : engineFactories.keySet()) {
            File langFolder = new File(scriptFolder, engineName.toLowerCase());
            if (!langFolder.exists() && langFolder.mkdir()) {
                // 创建失败
                System.out.println("Folder was not created!");
            } else {
                loadFiles(langFolder);
            }
        }
        LASTLOAD = System.currentTimeMillis();
    }

    public static ScriptEngine getEngine(String engineName) {
        ScriptEngineFactory factory = engineFactories.get(engineName);
        return factory == null ? null : factory.getScriptEngine();
    }

    public static void attachEntity(AttachCapabilitiesEvent<Entity> event) {
        Entity entity = event.getObject();
        if (entity instanceof EntityPlayerMP) {
            event.addCapability(location, new ScriptProvider(new CraftPlayer((EntityPlayerMP) entity)));
        }
    }

    public static void attachTileEntity(AttachCapabilitiesEvent<TileEntity> event) {
        TileEntity tile = event.getObject();
        if (tile != null && !tile.getWorld().isRemote) {
            event.addCapability(location, new ScriptProvider(new CraftTileEntity(tile)));
        }
    }

    public static void attachWorld(AttachCapabilitiesEvent<World> event) {
        World world = event.getObject();
        if (world instanceof WorldServer) {
            event.addCapability(location, new ScriptProvider(new CraftWorld((WorldServer) world)));
        }
    }

    public static IData getGTData() {
        return gtData;
    }

    public static IData getGSData() {
        return gsData;
    }
}
