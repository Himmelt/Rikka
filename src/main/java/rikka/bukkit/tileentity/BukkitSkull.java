package rikka.bukkit.tileentity;

import org.bukkit.block.Skull;
import rikka.api.tileentity.ISkull;

public class BukkitSkull<T extends Skull> extends BukkitTileEntity<T> implements ISkull {
    public BukkitSkull(T source) {
        super(source);
    }
}
