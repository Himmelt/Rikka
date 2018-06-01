package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.EndGateway;
import rikka.api.tileentity.IEndGateway;

public final class SpongeEndGateway extends SpongeTileEntity<EndGateway> implements IEndGateway {
    public SpongeEndGateway(EndGateway source) {
        super(source);
    }
}
