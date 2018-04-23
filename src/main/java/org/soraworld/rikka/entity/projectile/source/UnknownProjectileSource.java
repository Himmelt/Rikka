package org.soraworld.rikka.entity.projectile.source;

import org.soraworld.rikka.entity.projectile.Projectile;
import org.soraworld.rikka.util.math.Vector3d;

import java.util.Optional;

public final class UnknownProjectileSource implements ProjectileSource {

    UnknownProjectileSource() {
    }

    @Override
    public <T extends Projectile> Optional<T> launchProjectile(Class<T> projectileClass) {
        return Optional.empty();
    }

    @Override
    public <T extends Projectile> Optional<T> launchProjectile(Class<T> projectileClass, Vector3d velocity) {
        return Optional.empty();
    }
}
