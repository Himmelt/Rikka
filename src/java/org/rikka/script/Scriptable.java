package org.rikka.script;

import java.util.List;

public interface Scriptable {

    void runScript(ScriptType type, net.minecraftforge.fml.common.eventhandler.Event event);

    boolean isClient();

    boolean getEnabled();

    void setEnabled(boolean enabled);

    String getLanguage();

    void setLanguage(String lang);

    List<String> getScripts();

    String noticeString();
}
