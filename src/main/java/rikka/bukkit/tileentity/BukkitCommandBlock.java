package rikka.bukkit.tileentity;

import org.bukkit.block.CommandBlock;
import rikka.api.tileentity.ICommandBlock;

public abstract class BukkitCommandBlock<T extends CommandBlock> extends BukkitTileEntity<T> implements ICommandBlock {
    public BukkitCommandBlock(T source) {
        super(source);
    }
}
