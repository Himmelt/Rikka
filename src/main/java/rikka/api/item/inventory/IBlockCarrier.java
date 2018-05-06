package rikka.api.item.inventory;

import rikka.api.util.Direction;
import rikka.api.world.RLocatable;

public interface IBlockCarrier extends ICarrier, RLocatable {
    IInventory getInventory(Direction from);
}
