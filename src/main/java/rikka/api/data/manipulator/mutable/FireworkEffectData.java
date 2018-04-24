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

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.immutable.ImmutableFireworkEffectData;
import org.soraworld.rikka.entity.projectile.Firework;
import org.soraworld.rikka.item.FireworkEffect;
import org.soraworld.rikka.item.ItemTypes;
import org.soraworld.rikka.item.inventory.ItemStack;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.value.mutable.ListValue;

/**
 * A {@link DataManipulator} handling the various
 * {@link FireworkEffect}s associated with a {@link Firework} and
 * an {@link ItemStack} that is of the {@link ItemTypes#FIREWORKS} or {@link ItemTypes#FIREWORK_CHARGE}.
 */
public interface FireworkEffectData extends ListData<FireworkEffect, FireworkEffectData, ImmutableFireworkEffectData> {

    /**
     * Gets the {@link ListValue} of {@link FireworkEffect}s.
     *
     * <p>Note that for {@link ItemTypes#FIREWORK_CHARGE} only the first effect
     * will apply to the charge.</p>
     *
     * @return The list value of firework effects
     * @see Keys#FIREWORK_EFFECTS
     */
    default ListValue<FireworkEffect> effects() {
        return getListValue();
    }
}
