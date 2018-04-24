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
import rikka.api.data.manipulator.immutable.entity.ImmutableDamageableData;
import rikka.api.data.value.mutable.OptionalValue;
import rikka.api.entity.EntitySnapshot;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.ILiving;

import java.util.Optional;

/**
 * A {@link DataManipulator} for retaining the last known "attacker" for an
 * {@link IEntity}. If there is no known last attacker, the {@link #lastAttacker()}
 * may have an {@link Optional#EMPTY} value.
 *
 * <p>This data will usually only stay around for 100 ticks, which is generally
 * around 5 or so seconds.</p>
 */
public interface DamageableData extends DataManipulator<DamageableData, ImmutableDamageableData> {

    /**
     * Gets the {@link OptionalValue} for the last attacker.
     *
     * <p>This will usually be an entity snapshot of a {@link ILiving}.</p>
     *
     * <p>This data will usually only be present within 100 ticks of the attack
     * occurring.</p>
     *
     * @return The last attacker as an optional value
     * @see Keys#LAST_ATTACKER
     */
    OptionalValue<EntitySnapshot> lastAttacker();

    /**
     * Gets the last amount of damage taken by this entity as an optional value.
     *
     * <p>This data will usually only be present within 100 ticks of the attack
     * occurring.</p>
     *
     * @return The last damage dealt as an optional value
     * @see Keys#LAST_DAMAGE
     */
    OptionalValue<Double> lastDamage();

}