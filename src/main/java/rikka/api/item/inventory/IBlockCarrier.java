package rikka.api.item.inventory;

import rikka.api.util.Direction;
import rikka.api.world.Locatable;

public interface IBlockCarrier extends ICarrier, Locatable {
    IInventory getInventory(Direction from);
}
