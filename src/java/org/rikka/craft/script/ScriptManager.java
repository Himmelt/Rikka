package org.rikka.craft.script;

import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Nullable;

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

    /* 直接静态初始化 */
    private static long lastLoad = 0L;
    private static boolean started = false;
    private static boolean shouldSave = false;
    private static ScriptEngineManager engineManager = new ScriptEngineManager();
    /* Map 未填充初始化 */
    private static Map<String, String> langSuffixMap = new HashMap<>();
    private static Map<String, String> fileScriptMap = new HashMap<>();
    private static Map<String, ScriptEngineFactory> langFactoryMap = new HashMap<>();
    /* init 初始化 */
    private static File scriptFolder;
    private static File globalDataFile;

    public static void init(String saveFolder) {

        scriptFolder = new File(saveFolder, "scripts");
        globalDataFile = new File(scriptFolder, "global_data.json");

        for (ScriptEngineFactory factory : engineManager.getEngineFactories()) {
            if (!factory.getExtensions().isEmpty() &&
                    (factory.getScriptEngine() instanceof Invocable ||
                            factory.getLanguageName().equals("lua"))) {
                String suffix = "." + factory.getExtensions().get(0).toLowerCase();
                langSuffixMap.put(factory.getLanguageName(), suffix);
                langFactoryMap.put(factory.getLanguageName().toLowerCase(), factory);
            }
        }
    }

    public static boolean isStarted() {
        return started;
    }

    public static void setStarted(boolean started) {
        ScriptManager.started = started;
    }

    @Nullable
    public static ScriptEngine getEngineByName(String language) {
        ScriptEngineFactory factory = langFactoryMap.get(language.toLowerCase());
        return factory == null ? null : factory.getScriptEngine();
    }

    public static void reload() {
        if (!scriptFolder.exists() && scriptFolder.mkdir()) {
            // 未成功创建
            System.out.println("Folder was not created!");
        }

        if (!globalDataFile.exists()) {
            shouldSave = true;
        }
        // clear data
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

        lastLoad = System.currentTimeMillis();
    }

    public static boolean loadGlobalData() {

        try {
            if (!globalDataFile.exists()) {
                return false;
            } else {
                shouldSave = false;
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private static void loadScriptFiles(File folder, String name, String suffix) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                String filename = name + file.getName().toLowerCase();
                if (file.isDirectory()) {
                    loadScriptFiles(file, filename + "/", suffix);
                } else if (filename.endsWith(suffix)) {
                    try {
                        fileScriptMap.put(filename, FileUtils.readFileToString(file).trim());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static List<String> getFileScripts(String language) {
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

    public static long getLastLoad() {
        return lastLoad;
    }

}
