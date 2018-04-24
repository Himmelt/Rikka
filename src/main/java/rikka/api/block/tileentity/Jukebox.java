package rikka.api.block.tileentity;

import rikka.api.item.inventory.ItemStack;

public interface Jukebox extends TileEntity {
    void playRecord();

    void stopRecord();

    void ejectRecord();

    void insertRecord(ItemStack record);
}
