package rikka.api.entity.living;

import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.RProjectileSource;
import rikka.api.scoreboard.RTeamMember;

public interface ILiving extends IEntity, RProjectileSource, RTeamMember {

    double health();

    void setHealth(double health);

    double maxHealth();

    void setMaxHealth(double maxHealth);

    double lastDamage();

}
