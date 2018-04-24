package rikka.api.tileentity;

import net.minecraft.tileentity.TileEntity;
import org.soraworld.rikka.Rikka;
import org.soraworld.rikka.handler.IPosHandler;
import rikka.api.world.IWorld;

public interface ITileEntity extends Rikka<TileEntity>, IPosHandler {
    IWorld getWorld();
}
