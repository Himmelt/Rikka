package org.rikka.script;

import net.minecraft.nbt.NBTTagCompound;
import org.apache.commons.io.FileUtils;
import org.rikka.data.Data;
import org.rikka.script.data.StoredData;
import org.rikka.script.data.TempData;
import org.rikka.script.util.NBTJsonUtil;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScriptManager {

    public static ScriptManager INSTANCE;
    public static boolean STARTED = false;

    private Map<String, String> langSuffixMap = new HashMap<>();
    private Map<String, String> fileScriptMap = new HashMap<>();
    private Map<String, ScriptEngineFactory> langFactoryMap = new HashMap<>();
    private ScriptEngineManager engineManager;
    private File scriptFolder, globalDataFile;
    private long lastLoaded = 0L;
    private boolean shouldSave = false;
    // Data
    private TempData globalTempData = new TempData();
    private NBTTagCompound globalDataCompound = new NBTTagCompound();
    private StoredData globalStoredData = new StoredData(globalDataCompound);

    public ScriptManager(String saveFolder) {
        INSTANCE = this;
        engineManager = new ScriptEngineManager();
        scriptFolder = new File(saveFolder, "scripts");
        globalDataFile = new File(scriptFolder, "global_data.json");
        for (ScriptEngineFactory factory : engineManager.getEngineFactories()) {
            if (!factory.getExtensions().isEmpty() &&
                    (factory.getScriptEngine() instanceof Invocable ||
                            factory.getLanguageName().equals("lua"))) {
                String suffix = "." + factory.getExtensions().get(0).toLowerCase();
                this.langSuffixMap.put(factory.getLanguageName(), suffix);
                this.langFactoryMap.put(factory.getLanguageName().toLowerCase(), factory);
            }
        }
    }

    public Data getTempData() {
        return globalTempData;
    }

    public Data getStoredData() {
        return globalStoredData;
    }

    public ScriptEngine getEngineByName(String language) {
        ScriptEngineFactory factory = this.langFactoryMap.get(language.toLowerCase());
        return factory == null ? null : factory.getScriptEngine();
    }

    public void reload() {
        if (!this.scriptFolder.exists() && this.scriptFolder.mkdir()) {
            // 未成功创建
            System.out.println("Folder was not created!");
        }

        if (!this.globalDataFile.exists()) {
            this.shouldSave = true;
        }
        // clear data
        globalTempData.clear();
        fileScriptMap.clear();

        for (String lang : langSuffixMap.keySet()) {
            String suffix = langSuffixMap.get(lang);
            File langFolder = new File(scriptFolder, lang.toLowerCase());
            if (!langFolder.exists() && langFolder.mkdir()) {
                // 创建失败
                System.out.println("Folder was not created!");
            } else {
                loadScriptFiles(langFolder, "", suffix);
            }
        }

        this.lastLoaded = System.currentTimeMillis();
    }

    public boolean loadGlobalData() {

        try {
            if (!globalDataFile.exists()) {
                return false;
            } else {
                this.globalDataCompound = NBTJsonUtil.LoadFile(globalDataFile);
                this.shouldSave = false;
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error loading: " + globalDataFile.getAbsolutePath() + e);
            return false;
        }
    }

    private void loadScriptFiles(File folder, String name, String suffix) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                String filename = name + file.getName().toLowerCase();
                if (file.isDirectory()) {
                    this.loadScriptFiles(file, filename + "/", suffix);
                } else if (filename.endsWith(suffix)) {
                    try {
                        this.fileScriptMap.put(filename, FileUtils.readFileToString(file).trim());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public List<String> getFileScripts(String language) {
        List<String> list = new ArrayList<>();
        String suffix = langSuffixMap.get(language);
        if (suffix == null) {
            return list;
        } else {
            for (String filename : fileScriptMap.keySet()) {
                if (filename.endsWith(suffix)) {
                    list.add(filename);
                }
            }
            return list;
        }
    }

}
