package rikka.bukkit.tileentity;

import org.bukkit.block.Jukebox;
import rikka.api.item.inventory.IItemStack;
import rikka.api.tileentity.IJukebox;

public class BukkitJukebox<T extends Jukebox> extends BukkitTileEntity<T> implements IJukebox {
    public BukkitJukebox(T source) {
        super(source);
    }

    public void playRecord() {

    }

    public void stopRecord() {

    }

    public void ejectRecord() {

    }

    public void insertRecord(IItemStack record) {

    }
}
