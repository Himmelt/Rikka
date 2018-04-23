package org.soraworld.rikka.handler;

import net.minecraft.nbt.NBTTagCompound;
import org.soraworld.rikka.event.REvent;

import java.util.List;

public interface IScriptHandler {

    void run(REvent event);

    String getScript();

    void setScript(String script);

    List<String> getList();

    boolean getEnabled();

    void setEnabled(boolean enabled);

    String getEngineName();

    void setEngineName(String engineName);

    boolean isEditing();

    void setEditing(boolean editing);

    NBTTagCompound serializeNBT();

    void deserializeNBT(NBTTagCompound comp);

}
