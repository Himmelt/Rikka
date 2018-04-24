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
import rikka.api.data.manipulator.mutable.entity.SizeData;
import rikka.api.data.value.immutable.ImmutableBoundedValue;
import rikka.api.data.value.immutable.ImmutableValue;
import rikka.api.entity.IEntity;

/**
 * An {@link ImmutableDataManipulator} for the bounding box of an
 * {@link IEntity}. Usually the bounding box is not modifiable, but the base,
 * height, and "scale" is always known. The bounding box is axis aligned.
 */
public interface ImmutableSizeData extends ImmutableDataManipulator<ImmutableSizeData, SizeData> {

    /**
     * Gets the {@link ImmutableValue} for the "base" size.
     *
     * @return The immutable value for the base
     */
    ImmutableValue<Float> base();

    /**
     * Gets the {@link ImmutableValue} for the "height" size.
     *
     * @return The immutable value for the height
     */
    ImmutableValue<Float> height();


    /**
     * Gets the {@link ImmutableValue} for the "scale" size.
     *
     * @return The immutable value for the scale
     */
    ImmutableBoundedValue<Float> scale();

}