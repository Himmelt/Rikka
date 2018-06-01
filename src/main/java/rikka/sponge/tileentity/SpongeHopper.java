package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Hopper;
import rikka.api.tileentity.carrier.IHopper;

public final class SpongeHopper extends SpongeTileCarrier<Hopper> implements IHopper {
    public SpongeHopper(Hopper source) {
        super(source);
    }

    public void transferItem() {

    }
}
