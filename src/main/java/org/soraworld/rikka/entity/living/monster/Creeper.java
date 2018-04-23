package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.explosive.FusedExplosive;

public interface Creeper extends Monster, FusedExplosive {

    default Value<Boolean> charged() {
        return getValue(Keys.CREEPER_CHARGED).get();
    }

}
