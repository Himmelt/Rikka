package rikka.bukkit.tileentity;

import org.bukkit.block.FlowerPot;
import rikka.api.tileentity.IFlowerPot;

public class BukkitFlowerPot<T extends FlowerPot> extends BukkitTileEntity<T> implements IFlowerPot {
    public BukkitFlowerPot(T source) {
        super(source);
    }
}
