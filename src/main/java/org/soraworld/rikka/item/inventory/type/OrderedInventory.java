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
package org.soraworld.rikka.item.inventory.type;

import org.soraworld.rikka.item.inventory.Inventory;
import org.soraworld.rikka.item.inventory.ItemStack;
import org.soraworld.rikka.item.inventory.Slot;
import org.soraworld.rikka.item.inventory.property.SlotIndex;
import org.soraworld.rikka.item.inventory.transaction.InventoryTransactionResult;

import java.util.Optional;

/**
 * An Ordered Inventory contains {@link Slot}s in some pre-determined order with
 * indices between 0 and 1-{@link #capacity}.
 */
public interface OrderedInventory extends Inventory {

    /**
     * Gets and remove the stack at the supplied index in this Inventory.
     *
     * @param index slot index to query
     * @return matching stacks, as per the semantics of {@link Inventory#poll()}
     * @see Inventory#poll()
     */
    Optional<ItemStack> poll(SlotIndex index);

    /**
     * Gets and remove the stack at the supplied index in this Inventory.
     *
     * @param index slot index to query
     * @param limit item limit
     * @return matching stacks, as per the semantics of {@link Inventory#poll()}
     * @see Inventory#poll()
     */
    Optional<ItemStack> poll(SlotIndex index, int limit);

    /**
     * Gets without removing the stack at the supplied index in this Inventory.
     *
     * @param index slot index to query
     * @return matching stacks, as per the semantics of {@link Inventory#peek()}
     * @see Inventory#peek()
     */
    Optional<ItemStack> peek(SlotIndex index);

    /**
     * Gets without removing the stack at the supplied index in this Inventory.
     *
     * @param index slot index to query
     * @param limit item limit
     * @return matching stacks, as per the semantics of {@link Inventory#peek()}
     * @see Inventory#peek()
     */
    Optional<ItemStack> peek(SlotIndex index, int limit);

    /**
     * Sets the item in the specified slot.
     *
     * @param index Slot index to set
     * @param stack Stack to insert
     * @return matching stacks, as per the semantics of {@link Inventory#set}
     * @see Inventory#set(ItemStack)
     */
    InventoryTransactionResult set(SlotIndex index, ItemStack stack);

    /**
     * Gets the {@link Slot} at the specified position.
     *
     * @param index Slot index to retrieve
     * @return slot at the specified position, or {@link Optional#empty()} if
     * no matching slot
     */
    Optional<Slot> getSlot(SlotIndex index);

}
