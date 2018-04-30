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
package rikka.api.data.manipulator.immutable;

import rikka.api.data.manipulator.ImmutableDataManipulator;
import rikka.api.data.manipulator.mutable.FireworkEffectData;
import rikka.api.data.value.immutable.ImmutableListValue;
import rikka.api.entity.projectile.IFirework;
import rikka.api.item.FireworkEffect;
import rikka.api.item.ItemTypes;
import rikka.api.item.inventory.ItemStack;

/**
 * An {@link ImmutableDataManipulator} handling the various
 * {@link FireworkEffect}s associated with a {@link IFirework} and
 * an {@link ItemStack} that is of the {@link ItemTypes#FIREWORKS} or {@link ItemTypes#FIREWORK_CHARGE}.
 */
public interface ImmutableFireworkEffectData extends ImmutableListData<FireworkEffect, ImmutableFireworkEffectData, FireworkEffectData> {

    /**
     * Gets the {@link ImmutableListValue} of {@link FireworkEffect}s.
     *
     * <p>Note that for {@link ItemTypes#FIREWORK_CHARGE} only the first effect
     * will apply to the charge.</p>
     *
     * @return The list value of firework effects
     */
    default ImmutableListValue<FireworkEffect> effects() {
        return getListValue();
    }
}
