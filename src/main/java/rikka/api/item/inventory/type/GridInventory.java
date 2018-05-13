package rikka.api.item.inventory.type;

import com.flowpowered.math.vector.Vector2i;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.Slot;

import java.util.Optional;

public interface GridInventory extends Inventory2D {

    int getColumns();

    int getRows();

    Vector2i getDimensions();

    Optional<IItemStack> poll(int x, int y);

    Optional<IItemStack> poll(int x, int y, int limit);

    Optional<IItemStack> peek(int x, int y);

    Optional<IItemStack> peek(int x, int y, int limit);

    Optional<Slot> getSlot(int x, int y);

    Optional<InventoryRow> getRow(int y);

    Optional<InventoryColumn> getColumn(int x);

}
