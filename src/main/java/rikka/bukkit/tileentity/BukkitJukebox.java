package rikka.bukkit.tileentity;

import org.bukkit.block.Jukebox;
import rikka.api.item.inventory.IItemStack;
import rikka.api.tileentity.IJukebox;

public final class BukkitJukebox extends BukkitTileEntity<Jukebox> implements IJukebox {
    public BukkitJukebox(Jukebox source) {
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
