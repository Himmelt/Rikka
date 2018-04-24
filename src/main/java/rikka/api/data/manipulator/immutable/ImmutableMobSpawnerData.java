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
package rikka.api.data.manipulator.immutable;

import rikka.api.block.tileentity.MobSpawner;
import rikka.api.data.manipulator.ImmutableDataManipulator;
import rikka.api.data.manipulator.mutable.MobSpawnerData;
import rikka.api.data.value.immutable.ImmutableBoundedValue;
import rikka.api.data.value.immutable.ImmutableValue;
import rikka.api.data.value.immutable.ImmutableWeightedCollectionValue;
import rikka.api.entity.EntityArchetype;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.entity.vehicle.minecart.MobSpawnerMinecart;
import rikka.api.util.weighted.WeightedSerializableObject;

import java.util.Random;

/**
 * An {@link ImmutableDataManipulator} for all information surrounding a
 * {@link MobSpawner} and {@link MobSpawnerMinecart}. The data defined will
 * provide new {@link IEntity} spawns with varying types and data.
 */
public interface ImmutableMobSpawnerData extends ImmutableDataManipulator<ImmutableMobSpawnerData, MobSpawnerData> {

    /**
     * Gets the {@link ImmutableBoundedValue} for the remaining delay before
     * a new attempt at spawning an {@link IEntity} is made.
     *
     * @return The immutable bounded value for the remaining delay
     */
    ImmutableBoundedValue<Short> remainingDelay();

    /**
     * Gets the {@link ImmutableBoundedValue} for the minimum spawn delay
     * required between attempts to spawn an {@link IEntity}.
     *
     * @return The immutable bounded value of the minimum spawn delay
     */
    ImmutableBoundedValue<Short> minimumSpawnDelay();

    /**
     * Gets the {@link ImmutableBoundedValue} for the maximum spawn delay
     * required between attempts to spawn an {@link IEntity}.
     *
     * @return The immutable bounded value of the maximum spawn delay
     */
    ImmutableBoundedValue<Short> maximumSpawnDelay();

    /**
     * Gets the {@link ImmutableBoundedValue} for the count of successful
     * spawns of all {@link IEntity} instances from the owning spawner. This
     * count is simply a total count, there is no limitation on how many
     * attempts are made to spawn an {@link IEntity}.
     *
     * @return The immutable bounded value
     */
    ImmutableBoundedValue<Short> spawnCount();

    /**
     * Gets the {@link ImmutableBoundedValue} for the limitation on the number
     * of nearby {@link IEntity} instances can exist near the owning spawner. The
     * limitation is that if there are more {@link IEntity} instances than the
     * provided value, no attempts to spawn a new {@link IEntity} will be made.
     *
     * @return The immutable value of the maximum supported nearby entities
     */
    ImmutableBoundedValue<Short> maximumNearbyEntities();

    /**
     * Gets the {@link ImmutableBoundedValue} for the minimum range a
     * {@link IPlayer} must remain in proximity of the spawner, such that if a
     * {@link IPlayer} is NOT within the provided range, no attempts to spawn an
     * {@link IEntity} is made.
     *
     * @return The immutable value of the required player range to spawn
     * entities
     */
    ImmutableBoundedValue<Short> requiredPlayerRange();

    /**
     * Gets the {@link ImmutableBoundedValue} for the maximum range that an
     * {@link IEntity} can be spawned from the spawner.
     *
     * @return The immutable value of the maximum spawn range an entity can be
     * spawned
     */
    ImmutableBoundedValue<Short> spawnRange();

    /**
     * Gets the {@link ImmutableValue} for the overridden
     * {@link WeightedSerializableObject}{@code <EntityArchetype>} to spawn next. If possible, the next entity to
     * spawn may be chosen from the already provided
     * {@link #possibleEntitiesToSpawn()}.
     *
     * @return The next possible entity to spawn
     */
    ImmutableValue<WeightedSerializableObject<EntityArchetype>> nextEntityToSpawn();

    /**
     * Gets the {@link ImmutableWeightedCollectionValue} of all possible
     * {@link IEntity} instances that can be spawned by the spawner. As they
     * are all {@link WeightedSerializableObject} instances, their weight is
     * defined as a {@link Random} to determine the next {@link IEntity} that
     * will be spawned, unless overriden by {@link #nextEntityToSpawn()}.
     *
     * @return The immutable weighted entity collection value of entities
     */
    ImmutableWeightedCollectionValue<EntityArchetype> possibleEntitiesToSpawn();
}
