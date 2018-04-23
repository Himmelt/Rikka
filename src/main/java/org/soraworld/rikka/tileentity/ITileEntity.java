package org.soraworld.rikka.tileentity;

import net.minecraft.tileentity.TileEntity;
import org.soraworld.rikka.Rikka;
import org.soraworld.rikka.handler.IPosHandler;
import org.soraworld.rikka.world.IWorld;

public interface ITileEntity extends Rikka<TileEntity>, IPosHandler {
    IWorld getWorld();
}
