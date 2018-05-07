package rikka.api.entity.projectile.source;

import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.util.math.Vector3d;

public interface RProjectileSource {
    <P extends IProjectile> P launchProjectile(ProjectileType type);

    <P extends IProjectile> P launchProjectile(ProjectileType type, Vector3d velocity);
}
