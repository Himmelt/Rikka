package rikka.api.item.inventory.type;

import rikka.api.entity.living.IPlayer;
import rikka.api.item.inventory.IInventory;

public interface Interactable extends IInventory {
    boolean canInteractWith(IPlayer player);
}
