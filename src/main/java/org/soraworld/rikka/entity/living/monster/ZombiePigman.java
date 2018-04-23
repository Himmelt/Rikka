package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.AngerableData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;

public interface ZombiePigman extends Zombie {
    default AngerableData getAngerData() {
        return get(AngerableData.class).get();
    }

    default MutableBoundedValue<Integer> angerLevel() {
        return getValue(Keys.ANGER).get();
    }
}
