package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.ExpirableData;
import rikka.api.data.value.mutable.MutableBoundedValue;

public interface Endermite extends Monster {

    default ExpirableData getExpirableData() {
        return get(ExpirableData.class).get();
    }

    default MutableBoundedValue<Integer> expireTicks() {
        return getValue(Keys.EXPIRATION_TICKS).get();
    }
}
