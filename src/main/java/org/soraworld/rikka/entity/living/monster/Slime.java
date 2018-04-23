package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.SlimeData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;

public interface Slime extends Monster {

    default SlimeData getSlimeData() {
        return get(SlimeData.class).get();
    }

    default MutableBoundedValue<Integer> slimeSize() {
        return getValue(Keys.SLIME_SIZE).get();
    }

}
