package rikka.api.entity.living.animal;

import org.soraworld.rikka.data.type.DyeColor;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.DyeableData;
import rikka.api.data.value.mutable.Value;

public interface ISheep extends IAnimal {

    default DyeableData getDyeData() {
        return get(DyeableData.class).get();
    }

    default Value<DyeColor> color() {
        return getValue(Keys.DYE_COLOR).get();
    }

}
