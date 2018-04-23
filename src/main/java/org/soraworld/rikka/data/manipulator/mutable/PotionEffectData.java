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
package org.soraworld.rikka.data.manipulator.mutable;

import org.soraworld.rikka.data.DataHolder;
import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.immutable.ImmutablePotionEffectData;
import org.soraworld.rikka.data.value.mutable.ListValue;
import org.soraworld.rikka.effect.potion.PotionEffect;
import org.soraworld.rikka.entity.Entity;
import org.soraworld.rikka.item.ItemTypes;
import org.soraworld.rikka.item.inventory.ItemStack;

import java.util.List;

/**
 * Represents a {@link List} of {@link PotionEffect}s that can be applicable to
 * various {@link DataHolder}s such as {@link Entity}s, {@link ItemStack}s as
 * {@link ItemTypes#POTION}, etc.
 */
public interface PotionEffectData extends ListData<PotionEffect, PotionEffectData, ImmutablePotionEffectData> {

    /**
     * Gets the {@link ListValue} of the {@link PotionEffect}s.
     *
     * @return The list value of all potion effects contained
     * @see Keys#POTION_EFFECTS
     */
    default ListValue<PotionEffect> effects() {
        return getListValue();
    }

}
