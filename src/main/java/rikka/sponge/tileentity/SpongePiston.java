package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Piston;
import rikka.api.tileentity.IPiston;

public final class SpongePiston extends SpongeTileEntity<Piston> implements IPiston {
    public SpongePiston(Piston source) {
        super(source);
    }
}
