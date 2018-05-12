package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Sign;
import rikka.api.tileentity.ISign;

public class SpongeSign<T extends Sign> extends SpongeTileEntity<T> implements ISign {
    public SpongeSign(T source) {
        super(source);
    }
}
