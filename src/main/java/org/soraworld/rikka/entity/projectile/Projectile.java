package org.soraworld.rikka.entity.projectile;

import org.soraworld.rikka.entity.Entity;
import org.soraworld.rikka.entity.projectile.source.ProjectileSource;

public interface Projectile extends Entity {
    ProjectileSource getShooter();

    void setShooter(ProjectileSource shooter);
}
