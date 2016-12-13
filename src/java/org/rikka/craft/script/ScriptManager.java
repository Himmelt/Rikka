package org.rikka.craft.script;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import org.apache.commons.io.FileUtils;
import org.rikka.craft.capability.ScriptProvider;

import javax.annotation.Nullable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ScriptManager {

    @CapabilityInject(IScriptHandler.class)
    public static Capability<IScriptHandler> capability;


    public static long LASTLOAD = 0L;
    public static boolean STARTED = false;
    public static final Map<String, String> scriptFiles = new HashMap<>();
    private static final Map<String, String> engineLanguages = new HashMap<>();
    private static final Map<String, ScriptEngineFactory> engineFactories = new HashMap<>();
    private static File scriptFolder;


    public static void init(File saveFolder) {
        scriptFolder = new File(saveFolder, "scripts");
        for (ScriptEngineFactory factory : new ScriptEngineManager().getEngineFactories()) {
            String lang = factory.getEngineName().toLowerCase();
            if (lang.contains("nashorn")) {
                engineFactories.put("Nashorn", factory);
                engineLanguages.put("Nashorn", "javascript");
            } else if (lang.contains("lua")) {
                engineFactories.put("Luaj", factory);
                engineLanguages.put("Luaj", "lua");
            } else if (lang.contains("jython")) {
                engineFactories.put("Jython", factory);
                engineLanguages.put("Jython", "python");
            } else if (lang.contains("ruby")) {
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

    @Nullable
    static ScriptEngine getEngine(String engineName) {
        ScriptEngineFactory factory = engineFactories.get(engineName);
        return factory == null ? null : factory.getScriptEngine();
    }

    public static void attachEntity(AttachCapabilitiesEvent<Entity> event) {
        ResourceLocation location = new ResourceLocation("rikka:capScript");
        Entity entity = event.getObject();
        if ((entity instanceof EntityCow || entity instanceof EntityPlayerMP) && !entity.worldObj.isRemote) {
            event.addCapability(location, new ScriptProvider(entity));
        }
    }

}
