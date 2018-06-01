package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Dropper;
import rikka.api.tileentity.carrier.IDropper;

public final class SpongeDropper extends SpongeTileCarrier<Dropper> implements IDropper {
    public SpongeDropper(Dropper source) {
        super(source);
    }
}
