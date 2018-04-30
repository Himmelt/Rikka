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

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.immutable.entity.ImmutableDamagingData;
import rikka.api.data.value.mutable.MapValue;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.entity.EntityType;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.arrow.IArrow;

/**
 * A {@link DataManipulator} for an owner that will deal a certain amount of
 * damage on the next "attack". Usually applicable to {@link IArrow}s and other
 * {@link IProjectile}s.
 */
public interface DamagingData extends DataManipulator<DamagingData, ImmutableDamagingData> {

    /**
     * Gets the damage this projectile will deal to a {@link ILiving}
     * if hit.
     *
     * @return The damage to deal
     * @see Keys#ATTACK_DAMAGE
     */
    MutableBoundedValue<Double> damage();

    /**
     * Gets the {@link MapValue} for representing the custom damage
     * values to use if the owner strikes an entity of that type.
     *
     * <p>Note that in events, the damage defined for the provided
     * {@link EntityType} will take priority over the "default" damage as
     * defined from {@link #damage()}.</p>
     *
     * @return The immutable map value for the entity damage values
     * @see Keys#DAMAGE_ENTITY_MAP
     */
    MapValue<EntityType, Double> damageForEntity();

}
