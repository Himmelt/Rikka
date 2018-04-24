package rikka.api.entity.vehicle.minecart;

import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;

public interface ContainerMinecart<M extends ContainerMinecart<M>> extends Minecart, ICarrier, CarriedInventory<M> {
    @Override
    CarriedInventory<M> getInventory();
}
