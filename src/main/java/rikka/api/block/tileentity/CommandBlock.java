package rikka.api.block.tileentity;

import rikka.api.command.source.CommandBlockSource;

public interface CommandBlock extends TileEntity, CommandBlockSource {

    void execute();
}
