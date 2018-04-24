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
import rikka.api.data.manipulator.immutable.entity.ImmutableDominantHandData;
import rikka.api.data.manipulator.mutable.VariantData;
import rikka.api.data.property.entity.DominantHandProperty;
import rikka.api.data.type.HandPreference;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.player.IPlayer;

/**
 * A {@link DataManipulator} representing the dominant {@link HandPreference} of a
 * {@link ILiving} entity.
 * <p>Handedness usually determines which hand is used for "main" interactions,
 * such as tool use or block placing/breaking.</p>
 *
 * <p><i>NOTE: </i> This does not apply to {@link IPlayer}s, for Player
 * entities see {@link DominantHandProperty}.</p>
 */
public interface DominantHandData extends VariantData<HandPreference, DominantHandData, ImmutableDominantHandData> {

    /**
     * Gets the {@link Value} representing the dominant {@link HandPreference} of an
     * {@link IEntity}.
     *
     * @return The value for handedness
     * @see Keys#DOMINANT_HAND
     */
    Value<HandPreference> dominantHand();

}
