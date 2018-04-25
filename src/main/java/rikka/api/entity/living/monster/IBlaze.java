package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.living.IAerial;
import rikka.api.entity.projectile.IProjectileLauncher;

public interface IBlaze extends IMonster, IAerial, IProjectileLauncher {

    default Value<Boolean> aflame() {
        return getValue(Keys.IS_AFLAME).get();
    }

}
