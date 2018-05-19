package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Banner;
import rikka.api.tileentity.IBanner;

public final class SpongeBanner extends SpongeTileEntity<Banner> implements IBanner {
    public SpongeBanner(Banner source) {
        super(source);
    }
}
