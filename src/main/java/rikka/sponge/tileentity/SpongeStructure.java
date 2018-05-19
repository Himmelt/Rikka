package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Structure;
import rikka.api.tileentity.IStructure;

public final class SpongeStructure extends SpongeTileEntity<Structure> implements IStructure {
    public SpongeStructure(Structure source) {
        super(source);
    }
}
