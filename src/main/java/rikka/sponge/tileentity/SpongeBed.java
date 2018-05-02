package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Bed;
import rikka.api.tileentity.IBed;

public abstract class SpongeBed<T extends Bed> extends SpongeTileEntity<T> implements IBed {
    public SpongeBed(T source) {
        super(source);
    }
}
