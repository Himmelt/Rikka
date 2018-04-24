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
package rikka.api.util;

import rikka.api.CatalogType;
import rikka.api.block.BlockState;
import rikka.api.data.type.BrickType;
import rikka.api.data.type.DyeColor;

/**
 * Represents a type of {@link Enum} or pseudo enum, such as a
 * {@link CatalogType}, that can be "cycled" for the "next" value. The uses are
 * varying, but usually related to cycling {@link BlockState}s. Note that
 * {@link Cycleable} is <b>NOT</b> intended to cycle between "types" that have
 * no particular ordering, such as {@link DyeColor}, {@link BrickType}, etc.
 * due to their non-ordered nature. Applying an ordering on such types is not
 * recommended as there is no logic to a particular ordering, except that of
 * which they are registered.
 *
 * @param <T> The type of cycleable for type reference
 */
public interface Cycleable<T extends Cycleable<T>> {

    /**
     * Gets the "next" {@link Cycleable} instance to be considered
     * for cycling.
     *
     * @return The next value
     */
    T cycleNext();

}