package rikka.bukkit.tileentity;

import org.bukkit.block.DaylightDetector;
import rikka.api.tileentity.ILightDetector;

public abstract class BukkitLightDetector<T extends DaylightDetector> extends BukkitTileEntity<T> implements ILightDetector {
    public BukkitLightDetector(T source) {
        super(source);
    }
}
