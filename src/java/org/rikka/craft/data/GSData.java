package org.rikka.craft.data;

import net.minecraft.nbt.*;
import net.minecraft.world.WorldSavedData;
import org.rikka.data.IData;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Set;

public class GSData extends WorldSavedData implements IData {

    private final HashMap<String, Object> dataMap = new HashMap<>();


    public GSData() {
        super("rikkaData");
    }

    @Override
    public void put(String key, Object value) {
        dataMap.put(key, value);
        this.markDirty();
    }

    @Override
    public Object get(String key) {
        return dataMap.get(key);
    }

    @Override
    public void remove(String key) {
        dataMap.remove(key);
        this.markDirty();
    }

    @Override
    public boolean has(String key) {
        return dataMap.containsKey(key);
    }

    @Override
    public void clear() {
        dataMap.clear();
        this.markDirty();
    }

    @Override
    public Set<String> keySet() {
        return dataMap.keySet();
    }


    @Override
    public void readFromNBT(@Nonnull NBTTagCompound nbt) {
        dataMap.clear();
        for (String key : nbt.getKeySet()) {
            NBTBase base = nbt.getTag(key);
            if (base instanceof NBTTagByte) {
                dataMap.put(key, ((NBTTagByte) base).getByte() != 0);
            } else if (base instanceof NBTTagInt) {
                dataMap.put(key, ((NBTTagInt) base).getInt());
            } else if (base instanceof NBTTagShort) {
                dataMap.put(key, ((NBTTagShort) base).getShort());
            } else if (base instanceof NBTTagLong) {
                dataMap.put(key, ((NBTTagLong) base).getLong());
            } else if (base instanceof NBTTagFloat) {
                dataMap.put(key, ((NBTTagFloat) base).getFloat());
            } else if (base instanceof NBTTagDouble) {
                dataMap.put(key, ((NBTTagDouble) base).getDouble());
            } else if (base instanceof NBTTagString) {
                dataMap.put(key, ((NBTTagString) base).getString());
            }
        }
    }

    @Nonnull
    @Override
    public NBTTagCompound writeToNBT(@Nonnull NBTTagCompound compound) {
        for (String key : dataMap.keySet()) {
            Object value = dataMap.get(key);
            if (value instanceof Boolean) {
                compound.setBoolean(key, (Boolean) value);
            } else if (value instanceof Integer) {
                compound.setInteger(key, (Integer) value);
            } else if (value instanceof Short) {
                compound.setShort(key, (Short) value);
            } else if (value instanceof Long) {
                compound.setLong(key, (Long) value);
            } else if (value instanceof Float) {
                compound.setFloat(key, (Float) value);
            } else if (value instanceof Double) {
                compound.setDouble(key, (Double) value);
            } else if (value instanceof String) {
                compound.setString(key, (String) value);
            }
        }
        return compound;
    }
}
