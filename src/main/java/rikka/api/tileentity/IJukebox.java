package rikka.api.tileentity;

import rikka.api.item.inventory.ItemStack;

public interface IJukebox extends ITileEntity {
    void playRecord();

    void stopRecord();

    void ejectRecord();

    void insertRecord(ItemStack record);
}
