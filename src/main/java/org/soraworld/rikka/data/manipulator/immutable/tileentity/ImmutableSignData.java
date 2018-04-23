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
package org.soraworld.rikka.data.manipulator.immutable.tileentity;

import org.soraworld.rikka.block.tileentity.Sign;
import org.soraworld.rikka.data.manipulator.ImmutableDataManipulator;
import org.soraworld.rikka.data.manipulator.immutable.ImmutableListData;
import org.soraworld.rikka.data.manipulator.mutable.tileentity.SignData;
import org.soraworld.rikka.data.value.immutable.ImmutableListValue;
import org.soraworld.rikka.entity.living.player.Player;
import org.soraworld.rikka.text.Text;

import java.util.List;

/**
 * An {@link ImmutableDataManipulator} handling the {@link List} of
 * {@link Text} showing up on a {@link Sign} to a {@link Player}.
 */
public interface ImmutableSignData extends ImmutableListData<Text, ImmutableSignData, SignData> {

    /**
     * Gets the {@link ImmutableListValue} of {@link Text} for the {@link Sign}
     * to show.
     *
     * @return The immutable list of text lines
     */
    default ImmutableListValue<Text> lines() {
        return getListValue();
    }

}
