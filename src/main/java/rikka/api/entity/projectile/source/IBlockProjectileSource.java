package rikka.api.entity.projectile.source;

import rikka.api.block.IBlockState;
import rikka.api.world.IWorld;
import rikka.api.world.Location;

public interface IBlockProjectileSource extends IProjectileSource {
    Location<IWorld> getLocation();

    IBlockState getBlock();
}
