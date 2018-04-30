package rikka.api.entity.projectile;

import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.IProjectileSource;

public interface IProjectile extends IEntity {
    IProjectileSource getShooter();

    void setShooter(IProjectileSource shooter);
}
