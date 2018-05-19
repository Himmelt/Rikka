package rikka.bukkit.tileentity;

import org.bukkit.block.Banner;
import rikka.api.tileentity.IBanner;

public final class BukkitBanner extends BukkitTileEntity<Banner> implements IBanner {
    public BukkitBanner(Banner source) {
        super(source);
    }
}
