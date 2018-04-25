package rikka.api.block.tileentity;

import rikka.api.command.source.IBlockSender;

public interface CommandBlock extends TileEntity, IBlockSender {
    void execute();
}
