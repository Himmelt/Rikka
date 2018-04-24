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
import rikka.api.data.manipulator.immutable.ImmutableListData;
import rikka.api.data.manipulator.mutable.entity.PassengerData;
import rikka.api.data.value.immutable.ImmutableListValue;
import rikka.api.entity.IEntity;

import java.util.UUID;

/**
 * An {@link ImmutableDataManipulator} handling the link to the current
 * vehicle being ridden by an {@link IEntity}. With any "vehicle", there is
 * always a "base" vehicle.
 */
public interface ImmutablePassengerData extends ImmutableListData<UUID, ImmutablePassengerData, PassengerData> {

    /**
     * Gets the {@link ImmutableListValue} for the current {@link IEntity}
     * acting as a passenger.
     *
     * @return The immutable value for the passenger entity
     */
    ImmutableListValue<UUID> passengers();

}