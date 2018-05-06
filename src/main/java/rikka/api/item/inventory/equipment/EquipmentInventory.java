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
package rikka.api.item.inventory.equipment;

import rikka.api.entity.RArmorEquipable;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.Slot;
import rikka.api.item.inventory.property.EquipmentSlotType;
import rikka.api.item.inventory.transaction.InventoryTransactionResult;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.item.inventory.type.OrderedInventory;

import java.util.Optional;

/**
 * Equipment inventory for {@link ICarrier}s
 * that can carry equipment.
 */
public interface EquipmentInventory extends OrderedInventory, CarriedInventory<RArmorEquipable> {

    /**
     * Gets and remove the stack for the specified equipment type in this
     * Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @return removed ItemStack, per the semantics of {@link IInventory#poll()}
     * @see IInventory#poll()
     */
    Optional<IItemStack> poll(EquipmentSlotType equipmentType);

    /**
     * Gets and remove the items from the stack for the specified equipment type
     * in this Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @param limit         item limit
     * @return removed ItemStack, per the semantics of {@link IInventory#poll()}
     * @see IInventory#poll()
     */
    Optional<IItemStack> poll(EquipmentSlotType equipmentType, int limit);

    /**
     * Gets and remove the stack for the specified equipment type in this
     * Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @return removed ItemStack, per the semantics of {@link IInventory#poll()}
     * @see IInventory#poll()
     */
    Optional<IItemStack> poll(EquipmentType equipmentType);

    /**
     * Gets and remove the items from the stack for the specified equipment type
     * in this Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @param limit         item limit
     * @return removed ItemStack, per the semantics of {@link IInventory#poll()}
     * @see IInventory#poll()
     */
    Optional<IItemStack> poll(EquipmentType equipmentType, int limit);

    /**
     * Gets without removing the stack for the specified equipment type in this
     * Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @return removed ItemStack, per the semantics of {@link IInventory#peek()}
     * @see IInventory#peek()
     */
    Optional<IItemStack> peek(EquipmentSlotType equipmentType);

    /**
     * Gets without removing the items from the stack for the specified
     * equipment type in this Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @param limit         item limit
     * @return removed ItemStack, per the semantics of {@link IInventory#peek()}
     * @see IInventory#peek()
     */
    Optional<IItemStack> peek(EquipmentSlotType equipmentType, int limit);

    /**
     * Gets without removing the stack for the specified equipment type in this
     * Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @return removed ItemStack, per the semantics of {@link IInventory#peek()}
     * @see IInventory#peek()
     */
    Optional<IItemStack> peek(EquipmentType equipmentType);

    /**
     * Gets without removing the items from the stack for the specified
     * equipment type in this Inventory.
     *
     * @param equipmentType Type of equipment slot to query for
     * @param limit         item limit
     * @return removed ItemStack, per the semantics of {@link IInventory#peek()}
     * @see IInventory#peek()
     */
    Optional<IItemStack> peek(EquipmentType equipmentType, int limit);

    /**
     * Sets the item for the specified equipment type.
     *
     * @param equipmentType Type of equipment slot to set
     * @param stack         stack to insert
     * @return operation result, for details see {@link IInventory#set}
     * @see IInventory#set(IItemStack)
     */
    InventoryTransactionResult set(EquipmentSlotType equipmentType, IItemStack stack);

    /**
     * Sets the item for the specified equipment type.
     *
     * @param equipmentType Type of equipment slot to set
     * @param stack         stack to insert
     * @return operation result, for details see {@link IInventory#set}
     * @see IInventory#set(IItemStack)
     */
    InventoryTransactionResult set(EquipmentType equipmentType, IItemStack stack);

    /**
     * Gets the {@link Slot} for the specified equipment type.
     *
     * @param equipmentType Type of equipment slot to set
     * @return matching slot or {@link Optional#empty()} if no matching slot
     */
    Optional<Slot> getSlot(EquipmentSlotType equipmentType);

    /**
     * Gets the {@link Slot} for the specified equipment type.
     *
     * @param equipmentType Type of equipment slot to set
     * @return matching slot or {@link Optional#empty()} if no matching slot
     */
    Optional<Slot> getSlot(EquipmentType equipmentType);

}
