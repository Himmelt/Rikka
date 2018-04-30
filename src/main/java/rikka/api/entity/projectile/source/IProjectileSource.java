package rikka.api.entity.projectile.source;

import rikka.api.entity.projectile.IProjectile;
import rikka.api.util.math.Vector3d;

import java.util.Optional;

public interface IProjectileSource {

    <T extends IProjectile> Optional<T> launchProjectile(Class<T> projectileClass);

    <T extends IProjectile> Optional<T> launchProjectile(Class<T> projectileClass, Vector3d velocity);
}
