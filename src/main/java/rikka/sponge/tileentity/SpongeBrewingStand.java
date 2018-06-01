package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.BrewingStand;
import rikka.api.tileentity.carrier.IBrewingStand;

public final class SpongeBrewingStand extends SpongeTileCarrier<BrewingStand> implements IBrewingStand {
    public SpongeBrewingStand(BrewingStand source) {
        super(source);
    }

    public boolean brew() {
        return false;
    }
}
