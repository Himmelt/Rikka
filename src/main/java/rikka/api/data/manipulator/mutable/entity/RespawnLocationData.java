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
package rikka.api.data.manipulator.mutable.entity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.immutable.entity.ImmutableRespawnLocation;
import rikka.api.data.manipulator.mutable.MappedData;
import rikka.api.data.value.mutable.MapValue;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.util.RespawnLocation;
import rikka.api.world.World;

import java.util.Optional;
import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * A {@link DataManipulator} for the "respawn" location of a {@link IPlayer}. A
 * {@link IPlayer} may have multiple respawn locations, but can only have a
 * single respawn location per {@link World}.
 */
public interface RespawnLocationData extends MappedData<UUID, RespawnLocation, RespawnLocationData, ImmutableRespawnLocation> {

    /**
     * Gets the {@link MapValue} for the "respawn" locations set for various
     * {@link World#getUUID()} such that a {@link IPlayer} may not have a
     * respawn point for a particular {@link World}, but may have multiple
     * respawn points for other {@link World}s.
     *
     * @return The map for the respawn locations per world id
     * @see Keys#RESPAWN_LOCATIONS
     */
    default MapValue<UUID, RespawnLocation> respawnLocation() {
        return getMapValue();
    }

    /**
     * Gets the respawn location for the given world, if available. If the
     * respawn point for that world has not been set, {@link Optional#empty()}
     * is returned.
     *
     * @param world The world to check
     * @return The {@link RespawnLocation}
     */
    default Optional<RespawnLocation> getForWorld(World world) {
        return get(checkNotNull(world, "World cannot be null!").getUUID());
    }

}
