package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Jukebox;
import rikka.api.item.inventory.IItemStack;
import rikka.api.tileentity.IJukebox;

public class SpongeJukebox<T extends Jukebox> extends SpongeTileEntity<T> implements IJukebox {
    public SpongeJukebox(T source) {
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
