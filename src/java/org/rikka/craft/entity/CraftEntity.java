package org.rikka.craft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.rikka.RikkaType;
import org.rikka.craft.CraftRikka;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.entity.IEntity;
import org.rikka.world.IWorld;

public class CraftEntity<T extends Entity> extends CraftRikka<T> implements IEntity {

    private IWorld world;
    private IScriptHandler handler;


    public CraftEntity(T entity) {
        super(entity);
    }

    @Override
    public String getName() {
        return original.getName();
    }

    @Override
    public String getDisplayName() {
        return original.getDisplayName().getFormattedText();
    }

    @Override
    public double getX() {
        return original.posX;
    }

    @Override
    public void setX(double x) {
        original.posX = x;
    }

    @Override
    public double getY() {
        return original.posY;
    }

    @Override
    public void setY(double y) {
        original.posY = y;
    }

    @Override
    public double getZ() {
        return original.posZ;
    }

    @Override
    public void setZ(double z) {
        original.posZ = z;
    }

    @Override
    public int getBlockX() {
        return MathHelper.floor_double(original.posX);
    }

    @Override
    public int getBlockY() {
        return MathHelper.floor_double(original.posY);
    }

    @Override
    public int getBlockZ() {
        return MathHelper.floor_double(original.posZ);
    }

    @Override
    public void setPosition(double x, double y, double z) {
        original.setPosition(x, y, z);
    }

    @Override
    public long getAge() {
        return original.ticksExisted;
    }

    @Override
    public void despawn() {
        original.setDead();
    }

    @Override
    public T getMCEntity() {
        return original;
    }

    @Override
    public IWorld getWorld() {
        if (world == null && original.worldObj.hasCapability(ScriptManager.capability, null)) {
            world = (IWorld) original.worldObj.getCapability(ScriptManager.capability, null).getRikka();
        }
        return world;
    }

    @Override
    public RikkaType type() {
        return RikkaType.ENTITY;
    }
}
