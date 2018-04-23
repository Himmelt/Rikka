package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.living.Aerial;
import org.soraworld.rikka.entity.projectile.ProjectileLauncher;

public interface Blaze extends Monster, Aerial, ProjectileLauncher {

    default Value<Boolean> aflame() {
        return getValue(Keys.IS_AFLAME).get();
    }

}
