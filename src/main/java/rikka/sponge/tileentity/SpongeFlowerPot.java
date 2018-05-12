package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.FlowerPot;
import rikka.api.tileentity.IFlowerPot;

public class SpongeFlowerPot<T extends FlowerPot> extends SpongeTileEntity<T> implements IFlowerPot {
    public SpongeFlowerPot(T source) {
        super(source);
    }
}
