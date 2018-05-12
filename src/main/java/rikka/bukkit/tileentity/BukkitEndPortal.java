package rikka.bukkit.tileentity;

import org.bukkit.block.BlockState;
import rikka.api.tileentity.IEndPortal;

public class BukkitEndPortal<T extends BlockState> extends BukkitTileEntity<T> implements IEndPortal {
    public BukkitEndPortal(T source) {
        super(source);
    }
}
