package rikka.api.entity.living;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.entity.EntitySnapshot;
import org.soraworld.rikka.entity.IEntity;
import org.soraworld.rikka.entity.projectile.source.ProjectileSource;
import org.soraworld.rikka.util.math.Vector3d;
import rikka.api.data.manipulator.mutable.entity.DamageableData;
import rikka.api.data.manipulator.mutable.entity.HealthData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.data.value.mutable.OptionalValue;
import rikka.api.scoreboard.TeamMember;

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
