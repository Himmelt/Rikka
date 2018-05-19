package rikka.bukkit.tileentity;

import org.bukkit.block.EnderChest;
import rikka.api.tileentity.IEnderChest;

public final class BukkitEnderChest extends BukkitTileEntity<EnderChest> implements IEnderChest {
    public BukkitEnderChest(EnderChest source) {
        super(source);
    }
}
