package org.rikka.craft.script;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.data.Data;

public interface IScriptHandler {

    void reload();

    void run(ScriptType type, Event event);

    boolean getEnabled();

    void setEnabled(boolean enabled);

    String getEngineName();

    void setEngineName(String engineName);

    Data getTData();

    Data getSData();

    Object getObject();

    void setObject(Object object);

    void readFromNBT(NBTTagCompound compound);

    NBTTagCompound writeToNBT(NBTTagCompound compound);

}
