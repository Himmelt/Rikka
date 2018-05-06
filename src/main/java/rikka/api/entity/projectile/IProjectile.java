package rikka.api.entity.projectile;

import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.RProjectileSource;

public interface IProjectile extends IEntity {
    RProjectileSource getShooter();

    void setShooter(RProjectileSource shooter);
}
