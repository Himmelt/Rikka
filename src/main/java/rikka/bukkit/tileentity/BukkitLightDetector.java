package rikka.bukkit.tileentity;

import org.bukkit.block.DaylightDetector;
import rikka.api.tileentity.ILightDetector;

public final class BukkitLightDetector extends BukkitTileEntity<DaylightDetector> implements ILightDetector {
    public BukkitLightDetector(DaylightDetector source) {
        super(source);
    }
}
