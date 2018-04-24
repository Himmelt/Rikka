package rikka.api.entity.living;

import org.soraworld.rikka.entity.ArmorEquipable;
import org.soraworld.rikka.entity.Tamer;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.FoodData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.entity.projectile.IProjectileLauncher;

public interface Humanoid extends ILiving, IProjectileLauncher, ArmorEquipable, Tamer {

    default FoodData getFoodData() {
        return get(FoodData.class).get();
    }

    default MutableBoundedValue<Integer> foodLevel() {
        return getValue(Keys.FOOD_LEVEL).get();
    }

    default MutableBoundedValue<Double> exhaustion() {
        return getValue(Keys.EXHAUSTION).get();
    }

    default MutableBoundedValue<Double> saturation() {
        return getValue(Keys.SATURATION).get();
    }

}
