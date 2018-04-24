package rikka.api.block.tileentity.carrier;

import rikka.api.item.inventory.Inventory;

import java.util.Optional;
import java.util.Set;

public interface Chest extends TileEntityCarrier {
    Optional<Inventory> getDoubleChestInventory();

    Set<Chest> getConnectedChests();
}
