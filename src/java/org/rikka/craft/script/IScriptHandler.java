package org.rikka.craft.script;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.data.Data;

public interface IScriptHandler {

    void readFromNBT(NBTTagCompound compound);

    NBTTagCompound writeToNBT(NBTTagCompound compound);

    void run(ScriptType type, Event event);

    boolean isClient();

    boolean getEnabled();

    void setEnabled(boolean enabled);

    String getLanguage();

    void setLanguage(String language);

    Data getTData();

    Data getSData();

    Object getObject();

    void setObject(Object object);

}
