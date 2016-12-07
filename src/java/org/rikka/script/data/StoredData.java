package org.rikka.script.data;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import org.rikka.data.Data;

public class StoredData implements Data {

    private NBTTagCompound compound;

    public StoredData(NBTTagCompound compound) {
        this.compound = compound;
    }

    @Override
    public void put(String key, Object value) {
        if (value instanceof Number) {
            compound.setDouble(key, ((Number) value).doubleValue());
        } else if (value instanceof String) {
            compound.setString(key, (String) value);
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
    }

    @Override
    public boolean has(String key) {
        return compound.hasKey(key);
    }

    @Override
    public void clear() {
        compound = new NBTTagCompound();
    }
}
