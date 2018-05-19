package rikka.bukkit.tileentity;

import org.bukkit.block.FlowerPot;
import rikka.api.tileentity.IFlowerPot;

public final class BukkitFlowerPot extends BukkitTileEntity<FlowerPot> implements IFlowerPot {
    public BukkitFlowerPot(FlowerPot source) {
        super(source);
    }
}
