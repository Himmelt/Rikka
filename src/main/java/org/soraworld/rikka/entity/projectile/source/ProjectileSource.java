package org.soraworld.rikka.entity.projectile.source;

import org.soraworld.rikka.entity.projectile.Projectile;
import org.soraworld.rikka.util.math.Vector3d;

import java.util.Optional;

public interface ProjectileSource {

    UnknownProjectileSource UNKNOWN = new UnknownProjectileSource();

    <T extends Projectile> Optional<T> launchProjectile(Class<T> projectileClass);

    <T extends Projectile> Optional<T> launchProjectile(Class<T> projectileClass, Vector3d velocity);
}
