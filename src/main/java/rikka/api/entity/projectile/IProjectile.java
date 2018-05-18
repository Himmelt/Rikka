package rikka.api.entity.projectile;

import rikka.api.entity.IEntity;
import rikka.api.entity.api.ProjectileSource;

public interface IProjectile extends IEntity {
    ProjectileSource getShooter();

    void setShooter(ProjectileSource shooter);
}
