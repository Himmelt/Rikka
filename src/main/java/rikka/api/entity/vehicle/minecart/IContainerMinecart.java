package rikka.api.entity.vehicle.minecart;

import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;

public interface IContainerMinecart<M extends IContainerMinecart<M>> extends IMinecart, ICarrier, CarriedInventory<M> {
    @Override
    CarriedInventory<M> getInventory();
}
