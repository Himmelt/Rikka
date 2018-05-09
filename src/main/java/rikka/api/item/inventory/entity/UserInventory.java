package rikka.api.item.inventory.entity;

import rikka.api.entity.living.player.RUser;
import rikka.api.item.inventory.Slot;
import rikka.api.item.inventory.equipment.EquipmentInventory;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.item.inventory.type.GridInventory;

public interface UserInventory<T extends RUser> extends CarriedInventory<T> {
    MainPlayerInventory getMain();

    default Hotbar getHotbar() {
        return this.getMain().getHotbar();
    }

    default GridInventory getMainGrid() {
        return this.getMain().getGrid();
    }

    EquipmentInventory getEquipment();

    Slot getOffhand();
}
