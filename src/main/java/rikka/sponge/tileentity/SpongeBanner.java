package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Banner;
import rikka.api.tileentity.IBanner;

public abstract class SpongeBanner<T extends Banner> extends SpongeTileEntity<T> implements IBanner {
    public SpongeBanner(T source) {
        super(source);
    }
}
