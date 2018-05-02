package rikka.bukkit.tileentity;

import org.bukkit.block.EnderChest;
import rikka.api.tileentity.IEnderChest;

public abstract class BukkitEnderChest<T extends EnderChest> extends BukkitTileEntity<T> implements IEnderChest {
    public BukkitEnderChest(T source) {
        super(source);
    }
}
