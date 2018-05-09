package rikka.api.item.inventory.entity;

import rikka.api.item.inventory.type.GridInventory;

public interface MainPlayerInventory extends GridInventory {
    Hotbar getHotbar();

    GridInventory getGrid();
}
