package org.soraworld.rikka.entity.projectile;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.DamagingData;
import org.soraworld.rikka.data.value.mutable.MapValue;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.entity.EntityType;

public interface DamagingProjectile extends Projectile {

    default DamagingData getDamagingData() {
        return get(DamagingData.class).get();
    }

    default MutableBoundedValue<Double> damage() {
        return getValue(Keys.ATTACK_DAMAGE).get();
    }

    default MapValue<EntityType, Double> damageForEntity() {
        return getValue(Keys.DAMAGE_ENTITY_MAP).get();
    }

}
