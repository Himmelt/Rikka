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
package rikka.api.text.selector;

import rikka.api.util.generator.dummy.DummyObjectProvider;

/**
 * SelectorTypes is a list of the default selector types that are available in
 * Vanilla Minecraft.
 */
public final class SelectorTypes {

    // SORTFIELDS:ON

    /**
     * The all entities selector type.
     */
    public static final SelectorType ALL_ENTITIES = DummyObjectProvider.createFor(SelectorType.class, "ALL_ENTITIES");

    /**
     * The all players selector type.
     */
    public static final SelectorType ALL_PLAYERS = DummyObjectProvider.createFor(SelectorType.class, "ALL_PLAYERS");

    /**
     * The nearest player selector type.
     */
    public static final SelectorType NEAREST_PLAYER = DummyObjectProvider.createFor(SelectorType.class, "NEAREST_PLAYER");

    /**
     * The random selector type. This targets only players by default, but may
     * be used with entities if {@link ArgumentTypes#ENTITY_TYPE} is present in
     * a selector.
     */
    public static final SelectorType RANDOM = DummyObjectProvider.createFor(SelectorType.class, "RANDOM");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private SelectorTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}