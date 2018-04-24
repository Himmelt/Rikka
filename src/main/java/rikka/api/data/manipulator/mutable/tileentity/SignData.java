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
package rikka.api.data.manipulator.mutable.tileentity;

import rikka.api.block.tileentity.Sign;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.immutable.tileentity.ImmutableSignData;
import rikka.api.data.manipulator.mutable.ListData;
import rikka.api.data.value.mutable.ListValue;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.item.ItemTypes;
import rikka.api.item.inventory.ItemStack;
import rikka.api.text.Text;

import java.util.List;

/**
 * An {@link DataManipulator} handling the {@link List} of
 * {@link Text} showing up on a {@link Sign} to a {@link IPlayer}.
 *
 * <p>In Vanilla, this is always applicable to a {@link Sign}, which
 * always has lines present (even if they are empty). It may be present
 * on an {@link ItemStack} of {@link ItemTypes#SIGN}, depending on whether
 * the {@link ItemStack} has sign data stored in it.</p>
 */
public interface SignData extends ListData<Text, SignData, ImmutableSignData> {

    /**
     * Gets the {@link ListValue} of {@link Text} for the {@link Sign}
     * to show.
     *
     * @return The list of text lines
     * @see Keys#SIGN_LINES
     */
    default ListValue<Text> lines() {
        return getListValue();
    }


}
