package org.rikka.craft.tile;

import net.minecraft.tileentity.TileEntity;
import org.rikka.RikkaType;
import org.rikka.craft.CraftRikka;
import org.rikka.craft.script.ScriptManager;
import org.rikka.tile.ITileEntity;
import org.rikka.world.IWorld;

public class CraftTileEntity extends CraftRikka<TileEntity> implements ITileEntity {

    private IWorld world;

    public CraftTileEntity(TileEntity tile) {
        super(tile);
    }

    @Override
    public RikkaType type() {
        return RikkaType.TILE;
    }

    @Override
    public int getBlockX() {
        return original.getPos().getX();
    }

    @Override
    public int getBlockY() {
        return original.getPos().getY();
    }

    @Override
    public int getBlockZ() {
        return original.getPos().getZ();
    }

    @Override
    public IWorld getWorld() {
        if (world == null && original.getWorld().hasCapability(ScriptManager.capability, null)) {
            world = (IWorld) original.getWorld().getCapability(ScriptManager.capability, null).getRikka();
        }
        return world;
    }
}
