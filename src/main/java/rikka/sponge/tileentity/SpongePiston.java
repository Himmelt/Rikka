package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Piston;
import rikka.api.tileentity.IPiston;

public abstract class SpongePiston<T extends Piston> extends SpongeTileEntity<T> implements IPiston {
    public SpongePiston(T source) {
        super(source);
    }
}
