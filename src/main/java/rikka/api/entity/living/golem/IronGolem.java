package rikka.api.entity.living.golem;

import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;

public interface IronGolem extends Golem {

    default Value<Boolean> playerCreated() {
        return getValue(Keys.PLAYER_CREATED).get();
    }

}
