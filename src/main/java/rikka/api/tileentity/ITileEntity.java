package rikka.api.tileentity;

import rikka.api.block.IBlockState;
import rikka.api.world.RLocatable;

public interface ITileEntity extends RLocatable {
    boolean isValid();

    void setValid(boolean valid);

    IBlockState getBlock();

}
