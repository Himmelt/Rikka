/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package rikka.api.data.manipulator.mutable;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.immutable.ImmutableMobSpawnerData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.data.value.mutable.Value;
import rikka.api.data.value.mutable.WeightedCollectionValue;
import rikka.api.entity.EntityArchetype;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.util.weighted.WeightedSerializableObject;

import java.util.Random;

/**
 * Represents the data associated with a mob spawner, including the spawn delay,
 * the spawn count, and the list of possible entities that can be spawned.
 */
public interface MobSpawnerData extends DataManipulator<MobSpawnerData, ImmutableMobSpawnerData> {

    /**
     * Gets the {@link MutableBoundedValue} for the remaining delay before
     * a new attempt at spawning an {@link IEntity} is made.
     *
     * @return The immutable bounded value for the remaining delay
     * @see Keys#SPAWNER_REMAINING_DELAY
     */
    MutableBoundedValue<Short> remainingDelay();

    /**
     * Gets the {@link MutableBoundedValue} for the minimum spawn delay
     * required between attempts to spawn an {@link IEntity}.
     *
     * @return The bounded value of the minimum spawn delay
     * @see Keys#SPAWNER_MINIMUM_DELAY
     */
    MutableBoundedValue<Short> minimumSpawnDelay();

    /**
     * Gets the {@link MutableBoundedValue} for the maximum spawn delay
     * required between attempts to spawn an {@link IEntity}.
     *
     * @return The bounded value of the maximum spawn delay
     * @see Keys#SPAWNER_MAXIMUM_DELAY
     */
    MutableBoundedValue<Short> maximumSpawnDelay();

    /**
     * Gets the {@link MutableBoundedValue} for the count of successful
     * spawns of all {@link IEntity} instances from the owning spawner. This
     * count is simply a total count, there is no limitation on how many
     * attempts are made to spawn an {@link IEntity}.
     *
     * @return The immutable bounded value
     * @see Keys#SPAWNER_SPAWN_COUNT
     */
    MutableBoundedValue<Short> spawnCount();

    /**
     * Gets the {@link MutableBoundedValue} for the limitation on the number
     * of nearby {@link IEntity} instances can exist near the owning spawner. The
     * limitation is that if there are more {@link IEntity} instances than the
     * provided value, no attempts to spawn a new {@link IEntity} will be made.
     *
     * @return The bounded value of the maximum supported nearby entities
     * @see Keys#SPAWNER_MAXIMUM_NEARBY_ENTITIES
     */
    MutableBoundedValue<Short> maximumNearbyEntities();

    /**
     * Gets the {@link MutableBoundedValue} for the minimum range a
     * {@link IPlayer} must remain in proximity of the spawner, such that if a
     * {@link IPlayer} is NOT within the provided range, no attempts to spawn an
     * {@link IEntity} is made.
     *
     * @return The value of the required player range to spawn entities
     * @see Keys#SPAWNER_REQUIRED_PLAYER_RANGE
     */
    MutableBoundedValue<Short> requiredPlayerRange();

    /**
     * Gets the {@link MutableBoundedValue} for the maximum range that an
     * {@link IEntity} can be spawned from the spawner.
     *
     * @return The immutable value of the maximum spawn range an entity can be
     * spawned
     * @see Keys#SPAWNER_SPAWN_RANGE
     */
    MutableBoundedValue<Short> spawnRange();

    /**
     * Gets the {@link Value} for the overridden
     * {@link WeightedSerializableObject}{@code <EntityArchetype>} to spawn
     * next. If possible, the next entity to spawn may be chosen from the
     * already provided {@link #possibleEntitiesToSpawn()}.
     *
     * @return The next possible entity to spawn
     * @see Keys#SPAWNER_NEXT_ENTITY_TO_SPAWN
     */
    Value<WeightedSerializableObject<EntityArchetype>> nextEntityToSpawn();

    /**
     * Gets the {@link WeightedCollectionValue} of all possible
     * {@link IEntity} instances that can be spawned by the spawner. As they
     * are all {@link WeightedSerializableObject}{@code <EntityArchetype>}
     * instances, their weight is defined as a {@link Random} to determine
     * the next {@link IEntity} that will be spawned, unless overridden by
     * {@link #nextEntityToSpawn()}.
     *
     * @return The immutable weighted entity collection value of entities
     * @see Keys#SPAWNER_ENTITIES
     */
    WeightedCollectionValue<EntityArchetype> possibleEntitiesToSpawn();

}
