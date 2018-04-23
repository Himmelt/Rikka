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
package org.soraworld.rikka.data.manipulator.immutable.item;

import org.soraworld.rikka.data.manipulator.immutable.ImmutableVariantData;
import org.soraworld.rikka.data.manipulator.mutable.item.CookedFishData;
import org.soraworld.rikka.data.type.CookedFish;
import org.soraworld.rikka.item.ItemTypes;
import org.soraworld.rikka.item.inventory.ItemStack;

/**
 * A type of {@link ImmutableVariantData} handling the {@link CookedFish} of an
 * {@link ItemStack} of the {@link ItemTypes#COOKED_FISH}.
 *
 * <p>Since different types of fish have different properties, it is
 * recommended to further check the specific item properties associated with
 * the fish type from the item stack after changing this data.</p>
 */
public interface ImmutableCookedFishData extends ImmutableVariantData<CookedFish, ImmutableCookedFishData, CookedFishData> {

}
