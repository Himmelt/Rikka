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
import rikka.api.data.manipulator.mutable.entity.BreathingData;
import rikka.api.data.value.immutable.ImmutableBoundedValue;
import rikka.api.entity.IEntity;

/**
 * An {@link ImmutableDataManipulator} representing the current "air" quantity
 * that an {@link IEntity} can have while "under water".
 */
public interface ImmutableBreathingData extends ImmutableDataManipulator<ImmutableBreathingData, BreathingData> {

    /**
     * Gets the {@link ImmutableBoundedValue} for the remaining air. Can be
     * changed to {@code (air >= 0 && air <= maxAir)}.
     *
     * @return The immutable value of remaining air
     */
    ImmutableBoundedValue<Integer> remainingAir();

    /**
     * Gets the {@link ImmutableBoundedValue} for the maximum air capacity.
     * The reasoning for it being bounded is that the air capacity must always
     * remain at least 1.
     *
     * @return The immutable bounded value of maximum air capacity
     */
    ImmutableBoundedValue<Integer> maxAir();

}