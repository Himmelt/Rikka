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
package org.soraworld.rikka.data.manipulator.immutable;

import org.soraworld.rikka.block.BlockTypes;
import org.soraworld.rikka.data.DataHolder;
import org.soraworld.rikka.data.manipulator.ImmutableDataManipulator;
import org.soraworld.rikka.data.manipulator.mutable.WetData;
import org.soraworld.rikka.data.value.immutable.ImmutableValue;
import org.soraworld.rikka.entity.living.animal.Wolf;

/**
 * An {@link ImmutableDataManipulator} that handles the "wet" state of various
 * {@link DataHolder}s that can include {@link BlockTypes#SPONGE} blocks to
 * {@link Wolf} entities being "wet".
 */
public interface ImmutableWetData extends ImmutableDataManipulator<ImmutableWetData, WetData> {

    /**
     * Gets the {@link ImmutableValue} for the "wet" state.
     *
     * @return The immutable value for the wet state
     */
    ImmutableValue<Boolean> wet();

}
