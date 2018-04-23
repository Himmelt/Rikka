package org.soraworld.rikka.entity.projectile.source;

import org.soraworld.rikka.block.BlockState;
import org.soraworld.rikka.world.Location;
import org.soraworld.rikka.world.World;

public interface BlockProjectileSource extends ProjectileSource {
    Location<World> getLocation();

    BlockState getBlock();
}
