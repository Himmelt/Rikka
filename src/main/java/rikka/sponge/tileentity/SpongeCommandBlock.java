package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.CommandBlock;
import rikka.api.tileentity.ICommandBlock;

public abstract class SpongeCommandBlock<T extends CommandBlock> extends SpongeTileEntity<T> implements ICommandBlock {
    public SpongeCommandBlock(T source) {
        super(source);
    }
}
