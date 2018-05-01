package rikka.api.tileentity.carrier;

import rikka.api.item.inventory.IBlockCarrier;
import rikka.api.item.inventory.type.TileEntityInventory;
import rikka.api.tileentity.ITileEntity;

public interface ITileEntityCarrier extends ITileEntity, IBlockCarrier {
    TileEntityInventory<ITileEntityCarrier> getInventory();
}
