package rikka.api.tileentity.carrier;

import rikka.api.item.inventory.IInventory;

import java.util.Optional;
import java.util.Set;

public interface IChest extends ITileCarrier {
    Optional<IInventory> getDoubleChestInventory();

    Set<IChest> getConnectedChests();
}
