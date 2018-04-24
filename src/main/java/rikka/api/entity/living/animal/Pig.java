package rikka.api.entity.living.animal;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.PigSaddleData;
import rikka.api.data.value.mutable.Value;

public interface Pig extends IAnimal {

    default PigSaddleData getPigSaddleData() {
        return get(PigSaddleData.class).get();
    }

    default Value<Boolean> saddled() {
        return getValue(Keys.PIG_SADDLE).get();
    }

}
