package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.DyeableData;
import org.soraworld.rikka.data.type.DyeColor;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Sheep extends Animal {

    default DyeableData getDyeData() {
        return get(DyeableData.class).get();
    }

    default Value<DyeColor> color() {
        return getValue(Keys.DYE_COLOR).get();
    }

}
