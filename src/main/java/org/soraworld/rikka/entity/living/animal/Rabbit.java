package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.RabbitData;
import org.soraworld.rikka.data.type.RabbitType;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Rabbit extends Animal {

    default RabbitData getRabbitData() {
        return get(RabbitData.class).get();
    }

    default Value<RabbitType> variant() {
        return getValue(Keys.RABBIT_TYPE).get();
    }

}
