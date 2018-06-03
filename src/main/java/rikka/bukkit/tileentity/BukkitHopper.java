package rikka.bukkit.tileentity;

import org.bukkit.block.Hopper;
import rikka.api.tileentity.carrier.IHopper;

public final class BukkitHopper extends BukkitTileCarrier<Hopper> implements IHopper {
    public BukkitHopper(Hopper source) {
        super(source);
    }

    public void transferItem() {

    }
}
