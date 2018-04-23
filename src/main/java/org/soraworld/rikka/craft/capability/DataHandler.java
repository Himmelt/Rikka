package org.soraworld.rikka.craft.capability;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.*;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import org.rikka.data.IData;
import org.rikka.handler.IDataHandler;
import org.soraworld.rikka.craft.data.CraftData;
import org.soraworld.rikka.craft.data.WorldData;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class DataHandler implements IDataHandler, ICapabilitySerializable<NBTTagCompound> {
    @CapabilityInject(IDataHandler.class)
    public static Capability<IDataHandler> CAP;
    private static final ResourceLocation NBT = new ResourceLocation("rikka:SData");
    public static final IData GTData = new CraftData();
    public static final IData GSData = new WorldData();
    public static final Map<Integer, IDataHandler> worldHandlers = new HashMap<>();
    public static final Map<Integer, IDataHandler> playerHandlers = new HashMap<>();

    private IData tData = new CraftData();
    private IData sData = new CraftData();

    public final DataHandler world(int hash) {
        worldHandlers.put(hash, this);
        return this;
    }

    public final DataHandler player(int hash) {
        playerHandlers.put(hash, this);
        return this;
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return CAP.equals(capability);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return CAP.equals(capability) ? (T) this : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound comp = new NBTTagCompound();
        for (String key : sData.keySet()) {
            Object value = sData.get(key);
            if (value instanceof Boolean) {
                comp.setBoolean(key, (Boolean) value);
            } else if (value instanceof Integer) {
                comp.setInteger(key, (Integer) value);
            } else if (value instanceof Short) {
                comp.setShort(key, (Short) value);
            } else if (value instanceof Long) {
                comp.setLong(key, (Long) value);
            } else if (value instanceof Float) {
                comp.setFloat(key, (Float) value);
            } else if (value instanceof Double) {
                comp.setDouble(key, (Double) value);
            } else if (value instanceof String) {
                comp.setString(key, (String) value);
            }
        }
        return comp;
    }

    @Override
    public void deserializeNBT(NBTTagCompound comp) {
        sData.clear();
        for (String key : comp.getKeySet()) {
            NBTBase base = comp.getTag(key);
            if (base instanceof NBTTagByte) {
                sData.put(key, ((NBTTagByte) base).getByte() != 0);
            } else if (base instanceof NBTTagInt) {
                sData.put(key, ((NBTTagInt) base).getInt());
            } else if (base instanceof NBTTagShort) {
                sData.put(key, ((NBTTagShort) base).getShort());
            } else if (base instanceof NBTTagLong) {
                sData.put(key, ((NBTTagLong) base).getLong());
            } else if (base instanceof NBTTagFloat) {
                sData.put(key, ((NBTTagFloat) base).getFloat());
            } else if (base instanceof NBTTagDouble) {
                sData.put(key, ((NBTTagDouble) base).getDouble());
            } else if (base instanceof NBTTagString) {
                sData.put(key, ((NBTTagString) base).getString());
            }
        }
    }

    @Override
    public IData getTData() {
        return tData;
    }

    @Override
    public IData getSData() {
        return sData;
    }

    public void copy(IDataHandler data) {
        if (data != null) {
            tData = data.getTData();
            sData = data.getSData();
        }
    }

    public static void attachEntity(AttachCapabilitiesEvent<Entity> event) {
        Entity entity = event.getObject();
        if (entity instanceof EntityPlayerMP) {
            event.addCapability(NBT, new DataHandler().player(entity.hashCode()));
        } else if (entity instanceof EntityCreature) {
            event.addCapability(NBT, new DataHandler());
        }
    }

    public static void attachWorld(AttachCapabilitiesEvent<World> event) {
        World world = event.getObject();
        if (world instanceof WorldServer) {
            event.addCapability(NBT, new DataHandler().world(world.hashCode()));
        }
    }
}
