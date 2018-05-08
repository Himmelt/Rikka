package rikka.api.entity.living;

import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.RProjectileSource;

public interface ILiving extends IEntity, RProjectileSource {

    double health();

    void setHealth(double health);

    double maxHealth();

    void setMaxHealth(double maxHealth);

    double lastDamage();

}
