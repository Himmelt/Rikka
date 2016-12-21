package org.rikka.craft.entity;

import net.minecraft.entity.Entity;
import org.rikka.RikkaType;
import org.rikka.craft.CraftRikka;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.IData;
import org.rikka.entity.IEntity;
import org.rikka.world.IWorld;

public class CraftEntity<T extends Entity> extends CraftRikka<T> implements IEntity<T> {

    private final IScriptHandler handler;

    public CraftEntity(T entity) {
        super(entity);
        handler = new ScriptHandler(this);
    }

    @Override
    public IData getTData() {
        return handler.getTData();
    }

    @Override
    public IData getSData() {
        return handler.getSData();
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
    public void setX(int x) {
        original.posX = x;
    }

    @Override
    public void setY(int y) {
        original.posY = y;
    }

    @Override
    public void setZ(int z) {
        original.posZ = z;
    }

    @Override
    public int getX() {
        return (int) original.posX;
    }

    @Override
    public int getY() {
        return (int) original.posY;
    }

    @Override
    public int getZ() {
        return (int) original.posZ;
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
    public IWorld getWorld() {
        return (IWorld) ScriptManager.worldHandlers.get(original.worldObj.hashCode()).getRikka();
    }

    @Override
    public RikkaType getType() {
        return RikkaType.ENTITY;
    }

    public IScriptHandler getHandler() {
        return handler;
    }
}
