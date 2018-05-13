package rikka.api.item.inventory.type;

import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IInventory;

import java.util.Optional;

public interface CarriedInventory<C extends ICarrier> extends IInventory {
    Optional<C> getCarrier();
}
