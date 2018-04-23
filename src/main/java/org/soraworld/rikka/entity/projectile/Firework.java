package org.soraworld.rikka.entity.projectile;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.FireworkEffectData;
import org.soraworld.rikka.data.value.mutable.ListValue;
import org.soraworld.rikka.entity.explosive.FusedExplosive;
import org.soraworld.rikka.item.FireworkEffect;

public interface Firework extends Projectile, FusedExplosive {

    default FireworkEffectData getFireworkData() {
        return get(FireworkEffectData.class).get();
    }

    default ListValue<FireworkEffect> effects() {
        return getValue(Keys.FIREWORK_EFFECTS).get();
    }

}
