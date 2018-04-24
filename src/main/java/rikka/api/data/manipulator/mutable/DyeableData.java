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

import rikka.api.block.BlockTypes;
import rikka.api.data.DataHolder;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.immutable.ImmutableDyeableData;
import rikka.api.data.type.DyeColor;
import rikka.api.entity.living.animal.ISheep;
import rikka.api.entity.living.animal.IWolf;

/**
 * An {@link VariantData} handling the {@link DyeColor} for a
 * {@link DataHolder}, including {@link BlockTypes#WOOL}, {@link BlockTypes#STAINED_HARDENED_CLAY},
 * {@link BlockTypes#CARPET}, {@link BlockTypes#STAINED_GLASS}, {@link BlockTypes#STAINED_GLASS_PANE},
 * {@link ISheep}, and {@link IWolf}.
 *
 * @see Keys#DYE_COLOR
 */
public interface DyeableData extends VariantData<DyeColor, DyeableData, ImmutableDyeableData> {

}
