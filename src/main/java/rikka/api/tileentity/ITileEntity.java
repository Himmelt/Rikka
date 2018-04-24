package rikka.api.tileentity;

import net.minecraft.tileentity.TileEntity;
import rikka.api.Rikka;
import rikka.api.handler.IPosHandler;
import rikka.api.world.IWorld;

public interface ITileEntity extends Rikka<TileEntity>, IPosHandler {
    IWorld getWorld();
}
