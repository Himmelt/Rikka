package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.FlowerPot;
import rikka.api.tileentity.IFlowerPot;

public final class SpongeFlowerPot extends SpongeTileEntity<FlowerPot> implements IFlowerPot {
    public SpongeFlowerPot(FlowerPot source) {
        super(source);
    }
}
