package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.ExpirableData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;

public interface Endermite extends Monster {

    default ExpirableData getExpirableData() {
        return get(ExpirableData.class).get();
    }

    default MutableBoundedValue<Integer> expireTicks() {
        return getValue(Keys.EXPIRATION_TICKS).get();
    }
}
