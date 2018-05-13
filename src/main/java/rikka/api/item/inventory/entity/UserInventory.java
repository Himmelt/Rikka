package rikka.api.item.inventory.entity;

import rikka.api.entity.living.player.RUser;
import rikka.api.item.inventory.Slot;

public interface UserInventory<T extends RUser> {
    MainPlayerInventory getMain();

    default Hotbar getHotbar() {
        return this.getMain().getHotbar();
    }

    Slot getOffhand();
}
