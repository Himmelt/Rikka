package rikka.api.entity.api;

import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.util.math.Vector3d;

public interface ProjectileSource {
    IProjectile launchProjectile(ProjectileType type);

    IProjectile launchProjectile(ProjectileType type, Vector3d velocity);
}
