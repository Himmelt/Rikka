package org.rikka.script;

import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.data.Data;

import java.util.List;

public interface Scriptable<T> {

    void runScript(ScriptType type, Event event);

    boolean isClient();

    boolean getEnabled();

    Data getTData();

    Data getSData();

    void setEnabled(boolean enabled);

    String getLanguage();

    void setLanguage(String lang);

    List<String> getScripts();

    String noticeString();

    T getObject();

}
