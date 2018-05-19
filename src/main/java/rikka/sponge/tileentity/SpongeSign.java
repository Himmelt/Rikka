package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Sign;
import rikka.api.tileentity.ISign;

public final class SpongeSign extends SpongeTileEntity<Sign> implements ISign {
    public SpongeSign(Sign source) {
        super(source);
    }
}
