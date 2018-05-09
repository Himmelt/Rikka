package rikka.api.item.inventory.entity;

import rikka.api.item.inventory.type.InventoryRow;

public interface Hotbar extends InventoryRow {
    int getSelectedSlotIndex();

    void setSelectedSlotIndex(int index);
}
