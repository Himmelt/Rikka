package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.explosive.IFusedExplosive;

public interface ICreeper extends IMonster, IFusedExplosive {

    default Value<Boolean> charged() {
        return getValue(Keys.CREEPER_CHARGED).get();
    }

}
