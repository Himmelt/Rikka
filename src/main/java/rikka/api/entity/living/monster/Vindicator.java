package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;

public interface Vindicator extends Monster {
    default Value<Boolean> johnny() {
        return getValue(Keys.IS_JOHNNY).get();
    }
}
