package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.EndPortal;
import rikka.api.tileentity.IEndPortal;

public final class SpongeEndPortal extends SpongeTileEntity<EndPortal> implements IEndPortal {
    public SpongeEndPortal(EndPortal source) {
        super(source);
    }
}
