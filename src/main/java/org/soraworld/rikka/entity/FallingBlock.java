package org.soraworld.rikka.entity;

import org.soraworld.rikka.block.BlockState;
import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.FallingBlockData;
import org.soraworld.rikka.data.value.mutable.Value;

public interface FallingBlock extends Entity {

    default FallingBlockData getFallingBlockData() {
        return get(FallingBlockData.class).get();
    }

    default Value<Double> fallDamagePerBlock() {
        return getValue(Keys.FALL_DAMAGE_PER_BLOCK).get();
    }

    default Value<Double> maxFallDamage() {
        return getValue(Keys.MAX_FALL_DAMAGE).get();
    }

    default Value<BlockState> blockState() {
        return getValue(Keys.FALLING_BLOCK_STATE).get();
    }

    default Value<Boolean> canPlaceAsBlock() {
        return getValue(Keys.CAN_PLACE_AS_BLOCK).get();
    }

    default Value<Boolean> canDropAsItem() {
        return getValue(Keys.CAN_DROP_AS_ITEM).get();
    }

    default Value<Integer> fallTime() {
        return getValue(Keys.FALL_TIME).get();
    }

    default Value<Boolean> canHurtEntities() {
        return getValue(Keys.FALLING_BLOCK_CAN_HURT_ENTITIES).get();
    }

}
