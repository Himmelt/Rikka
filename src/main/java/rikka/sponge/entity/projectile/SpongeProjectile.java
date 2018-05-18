package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.Projectile;
import rikka.api.entity.api.ProjectileSource;
import rikka.api.entity.projectile.IProjectile;
import rikka.sponge.entity.SpongeEntity;

public class SpongeProjectile<T extends Projectile> extends SpongeEntity<T> implements IProjectile {
    public SpongeProjectile(T source) {
        super(source);
    }

    public ProjectileSource getShooter() {
        return null;
    }

    public void setShooter(ProjectileSource shooter) {
    }
}
