package rikka.bukkit.tileentity;

import org.bukkit.block.BlockState;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.type.TileEntityInventory;
import rikka.api.tileentity.carrier.ITileCarrier;
import rikka.api.util.Direction;

public class BukkitTileCarrier<T extends BlockState> extends BukkitTileEntity<T> implements ITileCarrier {
    public BukkitTileCarrier(T source) {
        super(source);
    }

    public TileEntityInventory<ITileCarrier> getInventory() {
        return null;
    }

    public IInventory getInventory(Direction from) {
        return null;
    }
}
