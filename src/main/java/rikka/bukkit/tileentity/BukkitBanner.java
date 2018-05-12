package rikka.bukkit.tileentity;

import org.bukkit.block.Banner;
import rikka.api.tileentity.IBanner;

public class BukkitBanner<T extends Banner> extends BukkitTileEntity<T> implements IBanner {
    public BukkitBanner(T source) {
        super(source);
    }
}
