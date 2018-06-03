package rikka.bukkit.tileentity;

import org.bukkit.block.BrewingStand;
import rikka.api.tileentity.carrier.IBrewingStand;

public final class BukkitBrewingStand extends BukkitTileCarrier<BrewingStand> implements IBrewingStand {
    public BukkitBrewingStand(BrewingStand source) {
        super(source);
    }

    public boolean brew() {
        return false;
    }
}
