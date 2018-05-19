package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Bed;
import rikka.api.tileentity.IBed;

public final class SpongeBed extends SpongeTileEntity<Bed> implements IBed {
    public SpongeBed(Bed source) {
        super(source);
    }
}
