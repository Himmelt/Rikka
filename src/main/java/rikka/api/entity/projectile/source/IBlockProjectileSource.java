package rikka.api.entity.projectile.source;

import rikka.api.block.IBlockState;
import rikka.api.world.Location;

public interface IBlockProjectileSource extends RProjectileSource {
    Location getLocation();

    IBlockState getBlock();
}
