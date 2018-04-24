package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.living.Aerial;
import rikka.api.entity.projectile.IProjectileLauncher;

public interface Blaze extends Monster, Aerial, IProjectileLauncher {

    default Value<Boolean> aflame() {
        return getValue(Keys.IS_AFLAME).get();
    }

}
