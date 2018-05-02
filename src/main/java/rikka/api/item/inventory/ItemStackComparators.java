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
package rikka.api.item.inventory;

import rikka.api.data.Property;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.mutable.entity.DamageableData;
import rikka.api.item.ItemType;
import rikka.api.util.generator.dummy.DummyObjectProvider;

import java.util.Comparator;

/**
 * A utility class for getting all available {@link Comparator}s for {@link IItemStack}s.
 */
public final class ItemStackComparators {

    /**
     * Compares ItemStacks based on {@link ItemType}.
     * This comparator will not return the same results as
     * ItemStack.equals(ItemStack) for ItemStacks with extra attached data,
     * different damage values, or different sizes.
     */
    public static final Comparator<IItemStack> TYPE = DummyObjectProvider.createExtendedFor(Comparator.class, "TYPE");

    /**
     * Compares ItemStacks based on
     * {@link IItemStack} size. This
     * comparator will not return the same results as
     * ItemStack.equals(ItemStack) for ItemStacks with extra attached data,
     * different types, or different damage values.
     */
    public static final Comparator<IItemStack> SIZE = DummyObjectProvider.createExtendedFor(Comparator.class, "SIZE");

    /**
     * Compares ItemStacks based on {@link ItemType}
     * and {@link IItemStack} size. This comparator will not return the same
     * results as ItemStack.equals(ItemStack) for ItemStacks with extra attached
     * data or different damage values.
     */
    public static final Comparator<IItemStack> TYPE_SIZE = DummyObjectProvider.createExtendedFor(Comparator.class, "TYPE_SIZE");

    /**
     * The default comparator for {@link IItemStack}s.
     */
    public static final Comparator<IItemStack> DEFAULT = DummyObjectProvider.createExtendedFor(Comparator.class, "TYPE_SIZE");

    /**
     * Compares ItemStacks based on its {@link Property} list.
     */
    public static final Comparator<IItemStack> PROPERTIES = DummyObjectProvider.createExtendedFor(Comparator.class, "PROPERTIES");

    /**
     * Compares ItemStacks based on their {@link DataManipulator}s.
     */
    public static final Comparator<IItemStack> ITEM_DATA = DummyObjectProvider.createExtendedFor(Comparator.class, "ITEM_DATA");

    /**
     * Compares ItemStacks based on their {@link DataManipulator}s ignoring {@link DamageableData}
     */
    public static final Comparator<IItemStack> ITEM_DATA_IGNORE_DAMAGE = DummyObjectProvider.createExtendedFor(Comparator.class, "ITEM_DATA_IGNORE_DAMAGE");

    /**
     * Compares ItemStacks only ignoring their stack-size.
     *
     * <p>This means for stackable items that they can stack together</p>
     */
    public static final Comparator<IItemStack> IGNORE_SIZE = DummyObjectProvider.createExtendedFor(Comparator.class, "IGNORE_SIZE");

    public static final Comparator<IItemStack> ALL = DummyObjectProvider.createExtendedFor(Comparator.class, "ALL");

    // Suppress default constructor to ensure non-instantiability.
    private ItemStackComparators() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
