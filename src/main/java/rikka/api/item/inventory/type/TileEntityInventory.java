package rikka.api.item.inventory.type;

import rikka.api.item.inventory.ICarrier;
import rikka.api.tileentity.ITileEntity;

import java.util.Optional;

public interface TileEntityInventory<T extends ITileEntity & ICarrier>
        extends PersistentInventory, Interactable, CarriedInventory<T> {
    Optional<T> getTileEntity();
}
