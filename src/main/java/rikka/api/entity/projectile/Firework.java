package rikka.api.entity.projectile;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.FireworkEffectData;
import rikka.api.data.value.mutable.ListValue;
import rikka.api.entity.explosive.FusedExplosive;
import rikka.api.item.FireworkEffect;

public interface Firework extends Projectile, FusedExplosive {

    default FireworkEffectData getFireworkData() {
        return get(FireworkEffectData.class).get();
    }

    default ListValue<FireworkEffect> effects() {
        return getValue(Keys.FIREWORK_EFFECTS).get();
    }

}
