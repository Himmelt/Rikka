package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Skull;
import rikka.api.tileentity.ISkull;

public abstract class SpongeSkull<T extends Skull> extends SpongeTileEntity<T> implements ISkull {
    public SpongeSkull(T source) {
        super(source);
    }
}
