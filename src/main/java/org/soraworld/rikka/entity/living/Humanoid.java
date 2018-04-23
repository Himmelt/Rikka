package org.soraworld.rikka.entity.living;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.FoodData;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.entity.ArmorEquipable;
import org.soraworld.rikka.entity.Tamer;
import org.soraworld.rikka.entity.projectile.ProjectileLauncher;

public interface Humanoid extends Living, ProjectileLauncher, ArmorEquipable, Tamer {

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
