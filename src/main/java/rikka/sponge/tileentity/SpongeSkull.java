package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Skull;
import rikka.api.tileentity.ISkull;

public final class SpongeSkull extends SpongeTileEntity<Skull> implements ISkull {
    public SpongeSkull(Skull source) {
        super(source);
    }
}
