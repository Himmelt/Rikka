package rikka.api.entity.living.monster;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.SlimeData;
import rikka.api.data.value.mutable.MutableBoundedValue;

public interface ISlime extends IMonster {

    default SlimeData getSlimeData() {
        return get(SlimeData.class).get();
    }

    default MutableBoundedValue<Integer> slimeSize() {
        return getValue(Keys.SLIME_SIZE).get();
    }

}
