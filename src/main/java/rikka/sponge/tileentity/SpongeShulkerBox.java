package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.ShulkerBox;
import rikka.api.tileentity.carrier.IShulkerBox;

public final class SpongeShulkerBox extends SpongeTileCarrier<ShulkerBox> implements IShulkerBox {
    public SpongeShulkerBox(ShulkerBox source) {
        super(source);
    }
}
