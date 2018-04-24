package rikka.api.entity.projectile;

import org.soraworld.rikka.entity.EntityType;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.DamagingData;
import rikka.api.data.value.mutable.MapValue;
import rikka.api.data.value.mutable.MutableBoundedValue;

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
