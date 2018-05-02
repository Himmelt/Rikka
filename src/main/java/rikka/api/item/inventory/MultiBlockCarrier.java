package rikka.api.item.inventory;

import rikka.api.util.Direction;
import rikka.api.world.Location;

import java.util.List;
import java.util.Optional;

public interface MultiBlockCarrier extends IBlockCarrier {

    List<Location> getLocations();

    Optional<IInventory> getInventory(Location at);

    Optional<IInventory> getInventory(Location at, Direction from);

}
