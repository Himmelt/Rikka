package org.soraworld.rikka.craft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import org.rikka.entity.IEntity;
import org.rikka.world.IWorld;
import org.soraworld.rikka.craft.CraftRikka;
import org.soraworld.rikka.craft.capability.DataHandler;
import org.soraworld.rikka.craft.world.CraftWorld;

public class CraftEntity<T extends Entity> extends CraftRikka<T> implements IEntity<T> {

    public CraftEntity(T entity) {
        super(entity);
    }

    @Override
    public String getName() {
        return origin.getName();
    }

    @Override
    public String getDisplayName() {
        return origin.getDisplayName().getFormattedText();
    }

    @Override
    public void setX(int x) {
        origin.posX = x;
    }

    @Override
    public void setY(int y) {
        origin.posY = y;
    }

    @Override
    public void setZ(int z) {
        origin.posZ = z;
    }

    @Override
    public int getX() {
        return (int) origin.posX;
    }

    @Override
    public int getY() {
        return (int) origin.posY;
    }

    @Override
    public int getZ() {
        return (int) origin.posZ;
    }

    @Override
    public BlockPos getPos() {
        return new BlockPos(origin.posX, origin.posY, origin.posZ);
    }

    @Override
    public void setPosition(double x, double y, double z) {
        origin.setPosition(x, y, z);
    }

    @Override
    public long getAge() {
        return origin.ticksExisted;
    }

    @Override
    public void despawn() {
        origin.setDead();
    }

    @Override
    public IWorld getWorld() {
        if (origin.worldObj instanceof WorldServer) {
            WorldServer world = (WorldServer) origin.worldObj;
            return new CraftWorld(world, DataHandler.worldHandlers.get(world.hashCode()));
        }
        return null;
    }

}
