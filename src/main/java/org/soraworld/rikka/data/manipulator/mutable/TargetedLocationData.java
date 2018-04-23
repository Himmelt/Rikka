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
package org.soraworld.rikka.data.manipulator.mutable;

import com.flowpowered.math.vector.Vector3d;
import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.DataManipulator;
import org.soraworld.rikka.data.manipulator.immutable.ImmutableTargetedLocationData;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.living.player.Player;
import org.soraworld.rikka.entity.projectile.EyeOfEnder;
import org.soraworld.rikka.item.inventory.ItemStack;

/**
 * An {@link DataManipulator} handling the a targeted {@link Vector3d}.
 *
 * <p>Usually for the case of a {@link EyeOfEnder}, the targeted {@link Vector3d}
 * is where the {@link EyeOfEnder} will move towards until its expiration time.
 * <p>
 * In the case of a {@link Player}, the targeted {@link Vector3d} is where any
 * compass seen by the player will point towards. Note that it is not possible
 * to set the target of an individual compass {@link ItemStack}.</p>
 */
public interface TargetedLocationData extends DataManipulator<TargetedLocationData, ImmutableTargetedLocationData> {

    /**
     * Gets the {@link Value} for the targeted {@link Vector3d}.
     *
     * @return The value for the targeted location
     * @see Keys#TARGETED_LOCATION
     */
    Value<Vector3d> target();

}
