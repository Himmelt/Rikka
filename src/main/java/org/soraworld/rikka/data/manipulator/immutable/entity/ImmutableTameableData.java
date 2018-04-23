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
package org.soraworld.rikka.data.manipulator.immutable.entity;

import org.soraworld.rikka.data.manipulator.ImmutableDataManipulator;
import org.soraworld.rikka.data.manipulator.mutable.entity.TameableData;
import org.soraworld.rikka.data.value.immutable.ImmutableOptionalValue;
import org.soraworld.rikka.entity.Tamer;
import org.soraworld.rikka.entity.living.animal.Animal;
import org.soraworld.rikka.entity.living.animal.Ocelot;
import org.soraworld.rikka.entity.living.animal.Wolf;

import java.util.UUID;

/**
 * An {@link ImmutableDataManipulator} that handles the link to the
 * {@link UUID} of the {@link Tamer} that has "tamed" an {@link Animal}.
 * Usually {@link Animal}s can not be tamed, however, certain few can.
 * Such as {@link Wolf} and {@link Ocelot}s.
 */
public interface ImmutableTameableData extends ImmutableDataManipulator<ImmutableTameableData, TameableData> {

    /**
     * Gets the {@link ImmutableOptionalValue} for the {@link UUID} of the
     * {@link Tamer}.
     *
     * @return The immutable optional value for the uuid of the tamer
     */
    ImmutableOptionalValue<UUID> owner();

}
