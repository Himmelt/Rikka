package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.AngerableData;
import rikka.api.data.value.mutable.MutableBoundedValue;

public interface ZombiePigman extends Zombie {
    default AngerableData getAngerData() {
        return get(AngerableData.class).get();
    }

    default MutableBoundedValue<Integer> angerLevel() {
        return getValue(Keys.ANGER).get();
    }
}
