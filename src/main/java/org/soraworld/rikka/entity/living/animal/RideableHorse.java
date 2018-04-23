package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.HorseData;
import org.soraworld.rikka.data.type.HorseColor;
import org.soraworld.rikka.data.type.HorseStyle;
import org.soraworld.rikka.data.value.mutable.Value;

public interface RideableHorse extends Horse {

    default HorseData getHorseData() {
        return get(HorseData.class).get();
    }

    default Value<HorseStyle> style() {
        return getValue(Keys.HORSE_STYLE).get();
    }

    default Value<HorseColor> color() {
        return getValue(Keys.HORSE_COLOR).get();
    }
}
