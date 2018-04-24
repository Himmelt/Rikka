package rikka.api.entity.living;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.DamageableData;
import rikka.api.data.manipulator.mutable.entity.HealthData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.data.value.mutable.OptionalValue;
import rikka.api.entity.EntitySnapshot;
import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.source.ProjectileSource;
import rikka.api.scoreboard.TeamMember;
import rikka.api.util.math.Vector3d;

public interface ILiving extends IEntity, ProjectileSource, TeamMember {

    default HealthData getHealthData() {
        return get(HealthData.class).get();
    }

    default MutableBoundedValue<Double> health() {
        return getValue(Keys.HEALTH).get();
    }

    default MutableBoundedValue<Double> maxHealth() {
        return getValue(Keys.MAX_HEALTH).get();
    }

    default DamageableData getDamageableData() {
        return get(DamageableData.class).get();
    }

    default OptionalValue<EntitySnapshot> lastAttacker() {
        return getValue(Keys.LAST_ATTACKER).get();
    }

    default OptionalValue<Double> lastDamage() {
        return getValue(Keys.LAST_DAMAGE).get();
    }

    Vector3d getHeadRotation();

    void setHeadRotation(Vector3d rotation);

    default void lookAt(Vector3d targetPos) {
    }

}
