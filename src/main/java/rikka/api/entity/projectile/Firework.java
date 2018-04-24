package rikka.api.entity.projectile;

import org.soraworld.rikka.entity.explosive.FusedExplosive;
import org.soraworld.rikka.item.FireworkEffect;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.FireworkEffectData;
import rikka.api.data.value.mutable.ListValue;

public interface Firework extends Projectile, FusedExplosive {

    default FireworkEffectData getFireworkData() {
        return get(FireworkEffectData.class).get();
    }

    default ListValue<FireworkEffect> effects() {
        return getValue(Keys.FIREWORK_EFFECTS).get();
    }

}
