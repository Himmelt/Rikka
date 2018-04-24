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
package rikka.api.data.manipulator.mutable;

import rikka.api.block.tileentity.TileEntity;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.immutable.ImmutableDisplayNameData;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.IEntity;
import rikka.api.item.inventory.ItemStack;
import rikka.api.text.Text;

/**
 * Represents the display name of an {@link ItemStack}, {@link IEntity}, or
 * {@link TileEntity}.
 *
 * <p>Exceptions are made with written books as the title and display name
 * are one and the same.</p>
 */
public interface DisplayNameData extends DataManipulator<DisplayNameData, ImmutableDisplayNameData> {

    /**
     * Gets the display name as a {@link Text}. The display name may be
     * player set, or it may be undefined.
     *
     * @return The display name, if available
     * @see Keys#DISPLAY_NAME
     */
    Value<Text> displayName();

}
