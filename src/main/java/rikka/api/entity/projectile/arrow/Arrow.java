package rikka.api.entity.projectile.arrow;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.KnockbackData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.entity.projectile.DamagingProjectile;

public interface Arrow extends DamagingProjectile {

    default KnockbackData getKnockbackData() {
        return get(KnockbackData.class).get();
    }

    default MutableBoundedValue<Integer> knockbackStrength() {
        return getValue(Keys.KNOCKBACK_STRENGTH).get();
    }

}
