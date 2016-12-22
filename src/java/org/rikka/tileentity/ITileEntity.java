package org.rikka.tileentity;

import net.minecraft.tileentity.TileEntity;
import org.rikka.Rikka;
import org.rikka.handler.IPosHandler;
import org.rikka.world.IWorld;

public interface ITileEntity extends Rikka<TileEntity>, IPosHandler {
    IWorld getWorld();
}
