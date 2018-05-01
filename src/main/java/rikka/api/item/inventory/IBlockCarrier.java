package rikka.api.item.inventory;

import rikka.api.util.Direction;
import rikka.api.world.Locatable;
import rikka.api.world.Location;

public interface IBlockCarrier extends ICarrier, Locatable {
    Location getLocation();

    Inventory getInventory(Direction from);
}
