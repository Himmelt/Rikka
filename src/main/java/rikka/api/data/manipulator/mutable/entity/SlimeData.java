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
import rikka.api.data.manipulator.immutable.entity.ImmutableSlimeData;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.entity.living.monster.Slime;

/**
 * An {@link DataManipulator} handling the "size" of a {@link Slime}. Depending
 * on the "size" of the {@link Slime}, it may have more health, deal more
 * damage, and appear larger in size.
 */
public interface SlimeData extends DataManipulator<SlimeData, ImmutableSlimeData> {

    /**
     * Gets the {@link MutableBoundedValue} for the "size" of a slime.
     *
     * @return The value for a slime
     * @see Keys#SLIME_SIZE
     */
    MutableBoundedValue<Integer> size();

}