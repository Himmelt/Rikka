package org.soraworld.rikka.entity;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.ExpOrbData;
import org.soraworld.rikka.data.value.mutable.Value;

public interface ExperienceOrb extends Entity {
    default ExpOrbData experienceHeld() {
        return get(ExpOrbData.class).get();
    }

    default Value<Integer> experience() {
        return getValue(Keys.CONTAINED_EXPERIENCE).get();
    }
}
