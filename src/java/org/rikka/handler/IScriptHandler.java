package org.rikka.handler;

import net.minecraft.nbt.NBTTagCompound;
import org.rikka.event.REvent;

public interface IScriptHandler {

    void run(REvent event);

    boolean getEnabled();

    void setEnabled(boolean enabled);

    String getEngineName();

    void setEngineName(String engineName);

    boolean isEditing();

    void setEditing(boolean editing);

    NBTTagCompound serializeNBT();

    void deserializeNBT(NBTTagCompound comp);
}
