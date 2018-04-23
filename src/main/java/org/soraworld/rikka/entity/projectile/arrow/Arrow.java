package org.soraworld.rikka.entity.projectile.arrow;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.KnockbackData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.entity.projectile.DamagingProjectile;

public interface Arrow extends DamagingProjectile {

    default KnockbackData getKnockbackData() {
        return get(KnockbackData.class).get();
    }

    default MutableBoundedValue<Integer> knockbackStrength() {
        return getValue(Keys.KNOCKBACK_STRENGTH).get();
    }

}
