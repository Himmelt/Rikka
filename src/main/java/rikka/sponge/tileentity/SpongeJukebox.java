package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Jukebox;
import rikka.api.tileentity.IJukebox;

public abstract class SpongeJukebox<T extends Jukebox> extends SpongeTileEntity<T> implements IJukebox {
    public SpongeJukebox(T source) {
        super(source);
    }
}
