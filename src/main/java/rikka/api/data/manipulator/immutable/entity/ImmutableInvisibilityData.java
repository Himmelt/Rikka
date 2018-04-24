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
package rikka.api.data.manipulator.immutable.entity;

import rikka.api.data.manipulator.ImmutableDataManipulator;
import rikka.api.data.manipulator.mutable.entity.InvisibilityData;
import rikka.api.data.value.immutable.ImmutableValue;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.IEntity;

/**
 * An {@link ImmutableDataManipulator} for the "vanish" state. If present,
 * the {@link IEntity} is rendered "vanish".
 */
public interface ImmutableInvisibilityData extends ImmutableDataManipulator<ImmutableInvisibilityData, InvisibilityData> {

    /**
     * Gets the {@link ImmutableValue} of the "invisible" state of an
     * {@link IEntity}.
     *
     * <p>Note that this is different from the {@link #vanish()} state as when an
     * {@link IEntity} is "invisible", update packets are still sent to all clients
     * and the server. Likewise, no </p>
     *
     * @return The immutable value of the invisible state
     */
    ImmutableValue<Boolean> invisible();

    /**
     * Gets the {@link ImmutableValue} of the "vanish" state of an
     * {@link IEntity}.
     *
     * @return The immutable value of the vanish state
     */
    ImmutableValue<Boolean> vanish();


    /**
     * Gets the {@link Value} of whether an {@link IEntity} that is "vanished" will
     * be ignored for collision detection. The collision detection can affect
     * collisions with other {@link IEntity entities}, blocks, etc.
     *
     * @return The value of the collision detection state
     */
    ImmutableValue<Boolean> ignoresCollisionDetection();

    /**
     * Gets the {@link Value} of whether an {@link IEntity} that is "vanished" will
     * be ignored when other {@link IEntity entities} are processing possible "targets"
     * for their AI.
     *
     * @return The value of the targetable detection state
     */
    ImmutableValue<Boolean> untargetable();

}
