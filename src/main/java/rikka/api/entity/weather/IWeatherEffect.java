package rikka.api.entity.weather;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.ExpirableData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.entity.IEntity;

public interface IWeatherEffect extends IEntity {

    boolean isEffect();

    void setEffect(boolean effect);

    default ExpirableData getExpiringData() {
        return get(ExpirableData.class).get();
    }

    default MutableBoundedValue<Integer> expireTicks() {
        return getValue(Keys.EXPIRATION_TICKS).get();
    }

}
