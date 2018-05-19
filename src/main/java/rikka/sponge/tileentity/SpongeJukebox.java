package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Jukebox;
import rikka.api.item.inventory.IItemStack;
import rikka.api.tileentity.IJukebox;

public final class SpongeJukebox extends SpongeTileEntity<Jukebox> implements IJukebox {
    public SpongeJukebox(Jukebox source) {
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
