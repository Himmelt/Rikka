package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.DaylightDetector;
import rikka.api.tileentity.ILightDetector;

public final class SpongeLightDetector extends SpongeTileEntity<DaylightDetector> implements ILightDetector {
    public SpongeLightDetector(DaylightDetector source) {
        super(source);
    }
}
