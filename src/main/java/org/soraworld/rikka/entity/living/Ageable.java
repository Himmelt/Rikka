package org.soraworld.rikka.entity.living;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.AgeableData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Ageable extends Creature {

    void setScaleForAge();

    default AgeableData getAgeData() {
        return get(AgeableData.class).get();
    }

    default MutableBoundedValue<Integer> age() {
        return getValue(Keys.AGE).get();
    }

    default Value<Boolean> adult() {
        return getValue(Keys.IS_ADULT).get();
    }

}
