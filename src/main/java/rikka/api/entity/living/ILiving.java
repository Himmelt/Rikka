package rikka.api.entity.living;

import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.RProjectileSource;
import rikka.api.scoreboard.RTeamMember;
import rikka.api.util.math.Vector3d;

public interface ILiving extends IEntity, RProjectileSource, RTeamMember {

    double health();

    void setHealth(double health);

    double maxHealth();

    void setMaxHealth(double maxHealth);

    IEntity lastAttacker();

    double lastDamage();

    Vector3d getHeadRotation();

    void setHeadRotation(Vector3d rotation);

    void lookAt(Vector3d target);

}
