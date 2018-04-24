package rikka.api.block.tileentity;

import rikka.api.block.BlockState;
import rikka.api.data.DataHolder;
import rikka.api.world.Locatable;
import rikka.api.world.LocatableBlock;

public interface TileEntity extends DataHolder, Locatable {
    boolean isValid();

    void setValid(boolean valid);

    TileEntityType getType();

    BlockState getBlock();

    TileEntityArchetype createArchetype();

    LocatableBlock getLocatableBlock();
}
