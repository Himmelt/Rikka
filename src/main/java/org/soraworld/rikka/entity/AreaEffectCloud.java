package org.soraworld.rikka.entity;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.AreaEffectCloudData;
import org.soraworld.rikka.data.value.mutable.ListValue;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.effect.particle.ParticleType;
import org.soraworld.rikka.effect.potion.PotionEffect;
import org.soraworld.rikka.util.Color;

public interface AreaEffectCloud extends Entity {

    default AreaEffectCloudData getAreaEffectCloudData() {
        return get(AreaEffectCloudData.class).get();
    }

    default Value<Color> color() {
        return getValue(Keys.AREA_EFFECT_CLOUD_COLOR).get();
    }

    default MutableBoundedValue<Double> radius() {
        return getValue(Keys.AREA_EFFECT_CLOUD_RADIUS).get();
    }

    default Value<ParticleType> particleType() {
        return getValue(Keys.AREA_EFFECT_CLOUD_PARTICLE_TYPE).get();
    }

    default MutableBoundedValue<Integer> duration() {
        return getValue(Keys.AREA_EFFECT_CLOUD_DURATION).get();
    }

    default MutableBoundedValue<Integer> waitTime() {
        return getValue(Keys.AREA_EFFECT_CLOUD_WAIT_TIME).get();
    }

    default MutableBoundedValue<Double> radiusOnUse() {
        return getValue(Keys.AREA_EFFECT_CLOUD_RADIUS_ON_USE).get();
    }

    default MutableBoundedValue<Double> radiusPerTick() {
        return getValue(Keys.AREA_EFFECT_CLOUD_RADIUS_PER_TICK).get();
    }

    default MutableBoundedValue<Integer> durationOnUse() {
        return getValue(Keys.AREA_EFFECT_CLOUD_DURATION_ON_USE).get();
    }

    default MutableBoundedValue<Integer> applicationDelay() {
        return getValue(Keys.AREA_EFFECT_CLOUD_REAPPLICATION_DELAY).get();
    }

    default ListValue<PotionEffect> effects() {
        return getValue(Keys.POTION_EFFECTS).get();
    }

    default MutableBoundedValue<Integer> age() {
        return getValue(Keys.AREA_EFFECT_CLOUD_AGE).get();
    }

}
