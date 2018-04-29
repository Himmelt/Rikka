package rikka.api.entity.projectile.source;

import rikka.api.block.IBlockState;
import rikka.api.world.Location;
import rikka.api.world.World;

public interface BlockProjectileSource extends ProjectileSource {
    Location<World> getLocation();

    IBlockState getBlock();
}
