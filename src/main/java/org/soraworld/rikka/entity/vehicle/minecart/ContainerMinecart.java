package org.soraworld.rikka.entity.vehicle.minecart;

import org.soraworld.rikka.item.inventory.Carrier;
import org.soraworld.rikka.item.inventory.type.CarriedInventory;

public interface ContainerMinecart<M extends ContainerMinecart<M>> extends Minecart, Carrier, CarriedInventory<M> {
    @Override
    CarriedInventory<M> getInventory();
}
