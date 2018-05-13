package rikka.api.item.inventory.crafting;

import rikka.api.item.inventory.type.OrderedInventory;

public interface CraftingInventory extends OrderedInventory {
    CraftingGridInventory getCraftingGrid();
}
