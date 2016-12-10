package org.rikka.craft.script;

import net.minecraftforge.fml.common.eventhandler.Event;

import java.util.List;

public interface Scriptable<T> {

    void runScript(ScriptType type, Event event);

    boolean isClient();

    boolean getEnabled();

    void setEnabled(boolean enabled);

    String getLanguage();

    void setLanguage(String lang);

    List<String> getScripts();

    String noticeString();

    T getObject();

}
