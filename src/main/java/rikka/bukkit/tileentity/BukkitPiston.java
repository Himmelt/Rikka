package rikka.bukkit.tileentity;

import org.bukkit.block.BlockState;
import rikka.api.tileentity.IPiston;

public class BukkitPiston<T extends BlockState> extends BukkitTileEntity<T> implements IPiston {
    public BukkitPiston(T source) {
        super(source);
    }
}
