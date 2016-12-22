package org.rikka.craft.tile;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import org.rikka.craft.CraftRikka;
import org.rikka.tileentity.ITileEntity;
import org.rikka.world.IWorld;

public class CraftTileEntity extends CraftRikka<TileEntity> implements ITileEntity {

    private final IWorld world;

    public CraftTileEntity(IWorld world, TileEntity tile) {
        super(tile);
        this.world = world;
    }

    @Override
    public int getX() {
        return origin.getPos().getX();
    }

    @Override
    public int getY() {
        return origin.getPos().getY();
    }

    @Override
    public int getZ() {
        return origin.getPos().getZ();
    }

    @Override
    public BlockPos getPos() {
        return origin.getPos();
    }

    @Override
    public IWorld getWorld() {
        return world;
    }

}
