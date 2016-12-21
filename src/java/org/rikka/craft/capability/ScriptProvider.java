package org.rikka.craft.capability;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import org.rikka.Rikka;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptManager;

import javax.annotation.Nullable;

public class ScriptProvider implements ICapabilitySerializable<NBTTagCompound> {

    private final IScriptHandler handler;


    public ScriptProvider(Rikka rikka) {
        handler = rikka.getHandler();
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
        return handler.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        handler.readFromNBT(nbt);
    }
}
