package rikka.api.block.tileentity.carrier;

import rikka.api.block.tileentity.TileEntity;
import rikka.api.item.inventory.BlockCarrier;
import rikka.api.item.inventory.type.TileEntityInventory;

public interface TileEntityCarrier extends TileEntity, BlockCarrier {
    TileEntityInventory<TileEntityCarrier> getInventory();
}
