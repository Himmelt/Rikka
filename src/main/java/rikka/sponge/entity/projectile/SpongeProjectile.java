package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.Projectile;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.source.RProjectileSource;
import rikka.sponge.entity.SpongeEntity;

public class SpongeProjectile<T extends Projectile> extends SpongeEntity<T> implements IProjectile {
    public SpongeProjectile(T source) {
        super(source);
    }

    public static <P extends IProjectile> P getProjectile(Projectile projectile) {
        return null;
    }

    public RProjectileSource getShooter() {
        return null;
    }

    public void setShooter(RProjectileSource shooter) {

    }
}
