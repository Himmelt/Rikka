package rikka.api.block.tileentity.carrier;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.tileentity.FurnaceData;
import rikka.api.data.value.mutable.MutableBoundedValue;

public interface Furnace extends TileEntityCarrier {
    boolean smelt();

    default FurnaceData getFurnaceData() {
        return get(FurnaceData.class).get();
    }

    default MutableBoundedValue<Integer> passedBurnTime() {
        return getValue(Keys.PASSED_BURN_TIME).get();
    }

    default MutableBoundedValue<Integer> maxBurnTime() {
        return getValue(Keys.MAX_BURN_TIME).get();
    }

    default MutableBoundedValue<Integer> passedCookTime() {
        return getValue(Keys.PASSED_COOK_TIME).get();
    }

    default MutableBoundedValue<Integer> maxCookTime() {
        return getValue(Keys.MAX_COOK_TIME).get();
    }
}
