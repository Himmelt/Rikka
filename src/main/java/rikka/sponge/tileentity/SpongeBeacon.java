package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Beacon;
import rikka.api.tileentity.carrier.IBeacon;

public final class SpongeBeacon extends SpongeTileCarrier<Beacon> implements IBeacon {
    public SpongeBeacon(Beacon source) {
        super(source);
    }

    public int getCompletedLevels() {
        return 0;
    }
}
