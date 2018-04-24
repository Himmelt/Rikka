package rikka.api.entity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.ExpOrbData;
import rikka.api.data.value.mutable.Value;

public interface ExperienceOrb extends IEntity {
    default ExpOrbData experienceHeld() {
        return get(ExpOrbData.class).get();
    }

    default Value<Integer> experience() {
        return getValue(Keys.CONTAINED_EXPERIENCE).get();
    }
}
