package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.DaylightDetector;
import rikka.api.tileentity.ILightDetector;

public abstract class SpongeLightDetector<T extends DaylightDetector> extends SpongeTileEntity<T> implements ILightDetector {
    public SpongeLightDetector(T source) {
        super(source);
    }
}
