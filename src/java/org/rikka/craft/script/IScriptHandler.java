package org.rikka.craft.script;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.Rikka;
import org.rikka.data.IData;

/**
 * The interface Script handler.
 */
public interface IScriptHandler {

    /**
     * Reload.
     */
    void reload();

    /**
     * Run.
     *
     * @param type  the type
     * @param event the event
     */
    void run(EnumHook type, Event event);

    /**
     * Gets enabled.
     *
     * @return the enabled
     */
    boolean getEnabled();

    /**
     * Sets enabled.
     *
     * @param enabled the enabled
     */
    void setEnabled(boolean enabled);

    /**
     * Gets engine name.
     *
     * @return the engine name
     */
    String getEngineName();

    /**
     * Sets engine name.
     *
     * @param engineName the engine name
     */
    void setEngineName(String engineName);

    /**
     * Gets t data.
     *
     * @return the t data
     */
    IData getTData();

    /**
     * Gets s data.
     *
     * @return the s data
     */
    IData getSData();

    /**
     * Gets rikka.
     *
     * @return the rikka
     */
    Rikka getRikka();

    /**
     * Sets rikka.
     *
     * @param rikka the rikka
     */
    void setRikka(Rikka rikka);

    /**
     * Read from nbt.
     *
     * @param compound the compound
     */
    void readFromNBT(NBTTagCompound compound);

    /**
     * 保存数据到NBT.
     *
     * @param compound 待存储数据的标签引用.
     * @return 存储完数据的标签引用
     */
    NBTTagCompound writeToNBT(NBTTagCompound compound);

    /**
     * 脚本主体(object)是否正在被编辑.
     *
     * @return 是否正在被编辑.
     */
    boolean isEditing();

    /**
     * 设置脚本主体(object)编辑状态.
     *
     * @param editing 状态
     */
    void setEditing(boolean editing);

}
