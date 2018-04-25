package rikka.api.entity.living;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.AgeableData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.data.value.mutable.Value;

public interface Ageable extends ICreature {

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
