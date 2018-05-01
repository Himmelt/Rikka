package rikka.api.item.inventory;

import rikka.api.item.inventory.type.CarriedInventory;

public interface ICarrier {
    CarriedInventory<? extends ICarrier> getInventory();
}
