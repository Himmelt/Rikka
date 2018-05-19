package rikka.bukkit.tileentity;

import org.bukkit.block.BlockState;
import rikka.api.tileentity.IPiston;

//TODO how to check the state
public final class BukkitPiston extends BukkitTileEntity<BlockState> implements IPiston {
    public BukkitPiston(BlockState source) {
        super(source);
    }
}
