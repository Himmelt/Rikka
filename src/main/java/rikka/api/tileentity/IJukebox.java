package rikka.api.tileentity;

import rikka.api.item.inventory.IItemStack;

public interface IJukebox extends ITileEntity {
    void playRecord();

    void stopRecord();

    void ejectRecord();

    void insertRecord(IItemStack record);
}
