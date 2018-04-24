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
import rikka.api.data.manipulator.mutable.entity.PickupDelayData;
import rikka.api.data.value.immutable.ImmutableBoundedValue;
import rikka.api.data.value.immutable.ImmutableValue;
import rikka.api.entity.Item;

/**
 * An {@link ImmutableDataManipulator} for handling the "pickup delay" of an
 * {@link Item}.
 */
public interface ImmutablePickupDelayData extends ImmutableDataManipulator<ImmutablePickupDelayData, PickupDelayData> {

    /**
     * Gets the {@link ImmutableBoundedValue} for the "pickup delay".
     *
     * @return The immutable bounded value for the "pickup delay"
     */
    ImmutableBoundedValue<Integer> delay();

    /**
     * Gets the {@link ImmutableValue} for the "is infinite" state of
     * the pickup delay.
     *
     * @return The value for the "is infinite" state
     */
    ImmutableValue<Boolean> infinite();

}