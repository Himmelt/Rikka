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
package rikka.api.data.manipulator.immutable.entity;

import rikka.api.data.manipulator.ImmutableDataManipulator;
import rikka.api.data.manipulator.immutable.ImmutableMappedData;
import rikka.api.data.manipulator.mutable.entity.RespawnLocationData;
import rikka.api.data.value.immutable.ImmutableMapValue;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.util.RespawnLocation;
import rikka.api.world.IWorld;

import java.util.Optional;
import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * An {@link ImmutableDataManipulator} for the "respawn" location of a
 * {@link IPlayer}. A {@link IPlayer} may have multiple respawn locations, but can
 * only have a single respawn location per {@link IWorld}. A location can be
 * "forced", which means they will spawn there even if it's not a valid bed.
 */
public interface ImmutableRespawnLocation extends ImmutableMappedData<UUID, RespawnLocation, ImmutableRespawnLocation, RespawnLocationData> {

    /**
     * Gets the {@link ImmutableMapValue} for the "respawn" locations set for
     * various {@link IWorld#getUUID()} such that a {@link IPlayer} may not
     * have a respawn point for a particular {@link IWorld}, but may have
     * multiple respawn points for other {@link IWorld}s.
     *
     * @return The immutable map for the respawn locations per world id
     */
    default ImmutableMapValue<UUID, RespawnLocation> respawnLocation() {
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
    default Optional<RespawnLocation> getForWorld(IWorld world) {
        return get(checkNotNull(world, "World cannot be null!").getUUID());
    }

}
