package rikka.api.entity.living.animal;

import org.soraworld.rikka.data.type.RabbitType;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.RabbitData;
import rikka.api.data.value.mutable.Value;

public interface IRabbit extends IAnimal {

    default RabbitData getRabbitData() {
        return get(RabbitData.class).get();
    }

    default Value<RabbitType> variant() {
        return getValue(Keys.RABBIT_TYPE).get();
    }

}
