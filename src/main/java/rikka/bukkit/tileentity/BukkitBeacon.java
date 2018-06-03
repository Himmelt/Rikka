package rikka.bukkit.tileentity;

import org.bukkit.block.Beacon;
import rikka.api.tileentity.carrier.IBeacon;

public final class BukkitBeacon extends BukkitTileCarrier<Beacon> implements IBeacon {
    public BukkitBeacon(Beacon source) {
        super(source);
    }

    public int getCompletedLevels() {
        return 0;
    }
}
