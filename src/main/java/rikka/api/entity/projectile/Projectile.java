package rikka.api.entity.projectile;

import org.soraworld.rikka.entity.projectile.source.ProjectileSource;
import rikka.api.entity.IEntity;

public interface Projectile extends IEntity {
    ProjectileSource getShooter();

    void setShooter(ProjectileSource shooter);
}
