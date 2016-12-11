package org.rikka.craft.entity;

import net.minecraft.util.math.MathHelper;
import org.rikka.World;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.Data;
import org.rikka.entity.Entity;
import org.rikka.entity.EntityType;

public class CraftEntity<T extends net.minecraft.entity.Entity> implements Entity {

    final T entity;
    private World world;
    private Data tData;
    private Data sData;

    public CraftEntity(T entity) {
        this.entity = entity;
        //world = new CraftWorld(entity.worldObj);
    }

    @Override
    public String getName() {
        return entity.getName();
    }

    @Override
    public String getDisplayName() {
        return entity.getDisplayName().getFormattedText();
    }

    @Override
    public double getX() {
        return entity.posX;
    }

    @Override
    public void setX(double x) {
        entity.posX = x;
    }

    @Override
    public double getY() {
        return entity.posY;
    }

    @Override
    public void setY(double y) {
        entity.posY = y;
    }

    @Override
    public double getZ() {
        return entity.posZ;
    }

    @Override
    public void setZ(double z) {
        entity.posZ = z;
    }

    @Override
    public int getBlockX() {
        return MathHelper.floor_double(entity.posX);
    }

    @Override
    public int getBlockY() {
        return MathHelper.floor_double(entity.posY);
    }

    @Override
    public int getBlockZ() {
        return MathHelper.floor_double(entity.posZ);
    }

    @Override
    public void setPosition(double x, double y, double z) {
        entity.setPosition(x, y, z);
    }

    @Override
    public final Data getTData() {
        if (tData == null && entity.hasCapability(ScriptManager.capability, null)) {
            IScriptHandler handler = entity.getCapability(ScriptManager.capability, null);
            tData = handler.getTData();
        }
        return tData;
    }

    @Override
    public final Data getSData() {
        if (sData == null && entity.hasCapability(ScriptManager.capability, null)) {
            IScriptHandler handler = entity.getCapability(ScriptManager.capability, null);
            sData = handler.getSData();
        }
        return sData;
    }

    @Override
    public long getAge() {
        return entity.ticksExisted;
    }

    @Override
    public void despawn() {
        entity.setDead();
    }

    @Override
    public T getMCEntity() {
        return entity;
    }

    @Override
    public World getWorld() {
        return world;
    }

    @Override
    public EntityType getType() {
        return EntityType.UNKNOWN;
    }
}
