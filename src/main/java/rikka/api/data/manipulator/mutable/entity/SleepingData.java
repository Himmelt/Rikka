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

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.immutable.entity.ImmutableSleepingData;
import org.soraworld.rikka.entity.living.Bat;
import org.soraworld.rikka.entity.living.player.IPlayer;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.value.mutable.Value;

/**
 * An {@link DataManipulator} for the "sleeping" state of a
 * {@link IPlayer}. Also applicable to {@link Bat}s where they can be
 * shown as "sleeping".
 */
public interface SleepingData extends DataManipulator<SleepingData, ImmutableSleepingData> {

    /**
     * Gets the {@link Value} for whether the owning {@link IPlayer}'s
     * "sleeping" state is ignored when vanilla mechanics dictate that all
     * {@link IPlayer}s must be sleeping to advance through the night.
     *
     * @return The immutable value for ignoring sleep
     * @see Keys#IS_SLEEPING
     */
    Value<Boolean> sleeping();

}
