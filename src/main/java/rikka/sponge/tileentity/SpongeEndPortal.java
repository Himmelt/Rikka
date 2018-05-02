package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.EndPortal;
import rikka.api.tileentity.IEndPortal;

public abstract class SpongeEndPortal<T extends EndPortal> extends SpongeTileEntity<T> implements IEndPortal {
    public SpongeEndPortal(T source) {
        super(source);
    }
}
