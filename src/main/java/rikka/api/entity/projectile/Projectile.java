package rikka.api.entity.projectile;

import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.ProjectileSource;

public interface Projectile extends IEntity {
    ProjectileSource getShooter();

    void setShooter(ProjectileSource shooter);
}
