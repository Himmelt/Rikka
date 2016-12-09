package org.rikka.script.data;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import org.rikka.data.Data;

import java.util.ArrayList;
import java.util.List;

public class StoredData implements Data {

    private final NBTTagCompound compound;
    private final List<String> keys = new ArrayList<>();

    /**
     * 构造新的存储变量.
     *
     * @param compound 必须是Entity或者Tile的CustomNBT(ForgeData)标签的引用,否则不能正确存储.
     */
    public StoredData(NBTTagCompound compound) {
        if (!compound.hasKey("SData", 10)) {
            compound.setTag("SData", new NBTTagCompound());
        }
        this.compound = compound.getCompoundTag("SData");
    }

    @Override
    public void put(String key, Object value) {
        if (value instanceof Number) {
            compound.setDouble(key, ((Number) value).doubleValue());
            keys.add(key);
        } else if (value instanceof String) {
            compound.setString(key, (String) value);
            keys.add(key);
        }
    }

    @Override
    public Object get(String key) {
        if (!compound.hasKey(key)) {
            return null;
        } else {
            NBTBase base = compound.getTag(key);
            return base instanceof NBTPrimitive ? new Double(((NBTPrimitive) base).getDouble())
                    : ((NBTTagString) base).getString();
        }
    }

    @Override
    public void remove(String key) {
        compound.removeTag(key);
        keys.remove(key);
    }

    @Override
    public boolean has(String key) {
        return keys.contains(key);
    }

    @Override
    public void clear() {
        for (String key : keys) {
            compound.removeTag(key);
        }
        keys.clear();
    }
}
