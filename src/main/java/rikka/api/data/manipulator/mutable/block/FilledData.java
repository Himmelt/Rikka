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
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.immutable.block.ImmutableFilledData;
import rikka.api.data.value.mutable.Value;

/**
 * A {@link DataManipulator} for the "filled" state. Usually applicable to
 * {@link BlockTypes#END_PORTAL_FRAME}.
 */
public interface FilledData extends DataManipulator<FilledData, ImmutableFilledData> {

    /**
     * Gets the {@link Value} for the "filled" state.
     *
     * @return The value for the "filled" state
     * @see Keys#FILLED
     */
    Value<Boolean> filled();

}
