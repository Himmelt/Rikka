package org.soraworld.rikka.entity.weather;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.ExpirableData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.entity.Entity;

public interface WeatherEffect extends Entity {

    boolean isEffect();

    void setEffect(boolean effect);

    default ExpirableData getExpiringData() {
        return get(ExpirableData.class).get();
    }

    default MutableBoundedValue<Integer> expireTicks() {
        return getValue(Keys.EXPIRATION_TICKS).get();
    }

}
