package org.soraworld.rikka.block.tileentity;

import org.soraworld.rikka.command.source.CommandBlockSource;

public interface CommandBlock extends TileEntity, CommandBlockSource {

    void execute();
}
