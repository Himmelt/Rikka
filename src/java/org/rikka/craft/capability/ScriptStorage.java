package org.rikka.craft.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import org.rikka.craft.script.IScriptHandler;

public class ScriptStorage implements Capability.IStorage<IScriptHandler> {
    @Override
    public NBTBase writeNBT(Capability<IScriptHandler> capability, IScriptHandler instance, EnumFacing side) {
        NBTTagCompound compound = new NBTTagCompound();
        NBTTagCompound sData = new NBTTagCompound();
        for (String key : instance.getSData().keySet()) {
            Object value = instance.getSData().get(key);
            if (value instanceof Number) {
                sData.setDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                sData.setString(key, (String) value);
            }
        }
        compound.setTag("SData", sData);
        compound.setTag("Script", instance.writeToNBT(new NBTTagCompound()));
        return compound;
    }

    @Override
    public void readNBT(Capability<IScriptHandler> capability, IScriptHandler instance, EnumFacing side, NBTBase nbt) {
        NBTTagCompound SData = ((NBTTagCompound) nbt).getCompoundTag("SData");
        instance.getSData().clear();
        for (String key : SData.getKeySet()) {
            NBTBase base = SData.getTag(key);
            instance.getSData().put(key, base instanceof NBTPrimitive
                    ? new Double(((NBTPrimitive) base).getDouble()) : ((NBTTagString) base).getString());
        }
        instance.readFromNBT(((NBTTagCompound) nbt).getCompoundTag("Script"));
    }
}
