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
package rikka.api.data.manipulator.mutable.block;

import rikka.api.block.BlockTypes;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.immutable.block.ImmutableAxisData;
import rikka.api.data.manipulator.mutable.VariantData;
import rikka.api.data.type.LogAxes;
import rikka.api.data.type.LogAxis;
import rikka.api.util.Axis;

/**
 * Represents the {@link Axis} aligned data for various "rotational" blocks
 * such as {@link BlockTypes#LOG}, {@link BlockTypes#QUARTZ_BLOCK}, etc.
 *
 * <p>Note that {@link BlockTypes#LOG} and {@link BlockTypes#LOG2} do NOT
 * utilize {@link Axis} but instead use {@link LogAxis} due to their nature
 * of having {@link LogAxes#NONE}.</p>
 *
 * @see Keys#AXIS
 */
public interface AxisData extends VariantData<Axis, AxisData, ImmutableAxisData> {

}
