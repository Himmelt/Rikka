package rikka.api.item.inventory.type;

import rikka.api.item.inventory.IInventory;

public interface PersistentInventory extends IInventory {
    void markDirty();
}
