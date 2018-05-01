package rikka.api.tileentity;

import rikka.api.command.source.IBlockSender;

public interface ICommandBlock extends ITileEntity, IBlockSender {
    void execute();
}
