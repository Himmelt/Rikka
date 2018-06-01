package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.TileEntityCarrier;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.type.TileEntityInventory;
import rikka.api.tileentity.carrier.ITileCarrier;
import rikka.api.util.Direction;

public class SpongeTileCarrier<T extends TileEntityCarrier> extends SpongeTileEntity<T> implements ITileCarrier {
    public SpongeTileCarrier(T source) {
        super(source);
    }

    public TileEntityInventory<ITileCarrier> getInventory() {
        return null;
    }

    public IInventory getInventory(Direction from) {
        return null;
    }
}
