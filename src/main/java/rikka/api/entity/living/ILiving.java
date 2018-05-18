package rikka.api.entity.living;

import rikka.api.entity.IEntity;
import rikka.api.entity.api.ProjectileSource;

public interface ILiving extends IEntity, ProjectileSource {

    double health();

    void setHealth(double health);

    double maxHealth();

    void setMaxHealth(double maxHealth);

    double lastDamage();

}
