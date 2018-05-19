package rikka.bukkit.tileentity;

import org.bukkit.block.BlockState;
import rikka.api.tileentity.IEndPortal;

// TODO check state
public final class BukkitEndPortal extends BukkitTileEntity<BlockState> implements IEndPortal {
    public BukkitEndPortal(BlockState source) {
        super(source);
    }
}
