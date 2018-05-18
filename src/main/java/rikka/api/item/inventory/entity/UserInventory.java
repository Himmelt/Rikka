package rikka.api.item.inventory.entity;

import rikka.api.entity.api.User;
import rikka.api.item.inventory.Slot;

public interface UserInventory<T extends User> {
    MainPlayerInventory getMain();

    default Hotbar getHotbar() {
        return this.getMain().getHotbar();
    }

    Slot getOffhand();
}
