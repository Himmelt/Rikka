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
import org.soraworld.rikka.data.manipulator.immutable.entity.ImmutablePassengerData;
import org.soraworld.rikka.entity.IEntity;
import rikka.api.data.manipulator.mutable.ListData;
import rikka.api.data.value.mutable.ListValue;
import rikka.api.data.value.mutable.Value;

import java.util.UUID;

/**
 * Signifies that an {@link IEntity} is a "passenger" of another {@link IEntity}.
 */
public interface PassengerData extends ListData<UUID, PassengerData, ImmutablePassengerData> {

    /**
     * Gets the {@link Value} for the current {@link IEntity} acting
     * as a passenger.
     *
     * @return The value for the passenger entity
     * @see Keys#PASSENGERS
     */
    ListValue<UUID> passengers();

}
