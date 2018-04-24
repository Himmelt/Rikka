package rikka.api.block.tileentity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.MobSpawnerData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.data.value.mutable.Value;
import rikka.api.data.value.mutable.WeightedCollectionValue;
import rikka.api.entity.EntityArchetype;
import rikka.api.util.weighted.WeightedSerializableObject;

public interface MobSpawner extends TileEntity {
    void spawnEntityBatchImmediately(boolean force);

    default MobSpawnerData getMobSpawnerData() {
        return get(MobSpawnerData.class).get();
    }

    default MutableBoundedValue<Short> remainingDelay() {
        return getValue(Keys.SPAWNER_REMAINING_DELAY).get();
    }

    default MutableBoundedValue<Short> minimumSpawnDelay() {
        return getValue(Keys.SPAWNER_MINIMUM_DELAY).get();
    }

    default MutableBoundedValue<Short> maximumSpawnDelay() {
        return getValue(Keys.SPAWNER_MAXIMUM_DELAY).get();
    }

    default MutableBoundedValue<Short> spawnCount() {
        return getValue(Keys.SPAWNER_SPAWN_COUNT).get();
    }

    default MutableBoundedValue<Short> maximumNearbyEntities() {
        return getValue(Keys.SPAWNER_MAXIMUM_NEARBY_ENTITIES).get();
    }

    default MutableBoundedValue<Short> requiredPlayerRange() {
        return getValue(Keys.SPAWNER_REQUIRED_PLAYER_RANGE).get();
    }

    default MutableBoundedValue<Short> spawnRange() {
        return getValue(Keys.SPAWNER_SPAWN_RANGE).get();
    }

    default Value<WeightedSerializableObject<EntityArchetype>> nextEntityToSpawn() {
        return getValue(Keys.SPAWNER_NEXT_ENTITY_TO_SPAWN).get();
    }

    default WeightedCollectionValue<EntityArchetype> possibleEntitiesToSpawn() {
        return getValue(Keys.SPAWNER_ENTITIES).get();
    }
}
