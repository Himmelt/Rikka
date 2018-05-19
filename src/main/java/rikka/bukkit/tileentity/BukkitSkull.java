package rikka.bukkit.tileentity;

import org.bukkit.block.Skull;
import rikka.api.tileentity.ISkull;

public final class BukkitSkull extends BukkitTileEntity<Skull> implements ISkull {
    public BukkitSkull(Skull source) {
        super(source);
    }
}
