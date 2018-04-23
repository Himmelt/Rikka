package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.PigSaddleData;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Pig extends Animal {

    default PigSaddleData getPigSaddleData() {
        return get(PigSaddleData.class).get();
    }

    default Value<Boolean> saddled() {
        return getValue(Keys.PIG_SADDLE).get();
    }

}
