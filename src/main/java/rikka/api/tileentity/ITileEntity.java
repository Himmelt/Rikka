package rikka.api.tileentity;

import rikka.api.block.IBlockState;
import rikka.api.world.Locatable;

public interface ITileEntity extends Locatable {
    boolean isValid();

    void setValid(boolean valid);

    TileEntityType getType();

    IBlockState getBlock();

    TileEntityArchetype createArchetype();
}
