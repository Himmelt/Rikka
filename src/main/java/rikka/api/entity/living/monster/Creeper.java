package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.explosive.FusedExplosive;

public interface Creeper extends Monster, FusedExplosive {

    default Value<Boolean> charged() {
        return getValue(Keys.CREEPER_CHARGED).get();
    }

}
