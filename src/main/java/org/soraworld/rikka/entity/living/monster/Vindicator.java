package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Vindicator extends Monster {
    default Value<Boolean> johnny() {
        return getValue(Keys.IS_JOHNNY).get();
    }
}
