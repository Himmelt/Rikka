package rikka.api.tileentity;

import rikka.api.command.IBlockSender;

public interface ICommandBlock extends ITileEntity, IBlockSender {
    void execute();
}
