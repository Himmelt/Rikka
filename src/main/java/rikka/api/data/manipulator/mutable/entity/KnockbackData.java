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
package rikka.api.data.manipulator.mutable.entity;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.immutable.entity.ImmutableKnockbackData;
import org.soraworld.rikka.entity.IEntity;
import org.soraworld.rikka.entity.projectile.arrow.Arrow;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.value.mutable.MutableBoundedValue;

/**
 * An {@link DataManipulator} for the "knockback" strength for an
 * {@link IEntity}'s next attack. Usually applicable to {@link Arrow}s, the
 * level of "knockback" such that the higher the knockback, the further the
 * attacked {@link IEntity} will be "knocked back".
 */
public interface KnockbackData extends DataManipulator<KnockbackData, ImmutableKnockbackData> {

    /**
     * Gets the {@link MutableBoundedValue} for the "knockback strength.
     *
     * @return The immutable value for the knockback strength
     * @see Keys#KNOCKBACK_STRENGTH
     */
    MutableBoundedValue<Integer> knockbackStrength();

}
