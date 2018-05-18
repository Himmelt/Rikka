package rikka.api.entity.api;

import rikka.api.block.IBlockState;
import rikka.api.world.Location;

public interface BlockProjectileSource extends ProjectileSource {
    Location getLocation();

    IBlockState getBlock();
}
