package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Structure;
import rikka.api.tileentity.IStructure;

public class SpongeStructure<T extends Structure> extends SpongeTileEntity<T> implements IStructure {
    public SpongeStructure(T source) {
        super(source);
    }
}
