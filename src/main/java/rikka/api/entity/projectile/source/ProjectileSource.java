package rikka.api.entity.projectile.source;

import rikka.api.entity.projectile.Projectile;
import rikka.api.util.math.Vector3d;

import java.util.Optional;

public interface ProjectileSource {

    UnknownProjectileSource UNKNOWN = new UnknownProjectileSource();

    <T extends Projectile> Optional<T> launchProjectile(Class<T> projectileClass);

    <T extends Projectile> Optional<T> launchProjectile(Class<T> projectileClass, Vector3d velocity);
}
