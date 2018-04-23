package org.soraworld.rikka.entity.living.golem;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.value.mutable.Value;

public interface IronGolem extends Golem {

    default Value<Boolean> playerCreated() {
        return getValue(Keys.PLAYER_CREATED).get();
    }

}
