package rikka.api.entity.living.animal;

import org.soraworld.rikka.data.type.HorseStyle;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.HorseData;
import rikka.api.data.type.HorseColor;
import rikka.api.data.value.mutable.Value;

public interface IRideableHorse extends IHorse {

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
