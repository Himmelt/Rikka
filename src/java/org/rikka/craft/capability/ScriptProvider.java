package org.rikka.craft.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import org.jetbrains.annotations.Nullable;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptHandler;
import org.rikka.craft.script.ScriptManager;

public class ScriptProvider implements ICapabilitySerializable<NBTTagCompound> {

    private IScriptHandler handler = new ScriptHandler();

    public ScriptProvider(Object object) {
        handler.setObject(object);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return ScriptManager.capability.equals(capability);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return ScriptManager.capability.equals(capability) ? (T) handler : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        //return (NBTTagCompound) storage.writeNBT(ScriptManager.capability, handler, null);
        NBTTagCompound compound = new NBTTagCompound();
        NBTTagCompound sData = new NBTTagCompound();
        for (String key : handler.getSData().keySet()) {
            Object value = handler.getSData().get(key);
            if (value instanceof Number) {
                sData.setDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                sData.setString(key, (String) value);
            }
        }
        compound.setTag("SData", sData);
        compound.setTag("Script", handler.writeToNBT(new NBTTagCompound()));
        return compound;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        //storage.readNBT(ScriptManager.capability, handler, null, nbt);
        NBTTagCompound SData = nbt.getCompoundTag("SData");
        handler.getSData().clear();
        for (String key : SData.getKeySet()) {
            NBTBase base = SData.getTag(key);
            handler.getSData().put(key, base instanceof NBTPrimitive
                    ? new Double(((NBTPrimitive) base).getDouble()) : ((NBTTagString) base).getString());
        }
        handler.readFromNBT(nbt.getCompoundTag("Script"));
    }
}
