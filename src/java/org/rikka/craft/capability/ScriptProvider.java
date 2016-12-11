package org.rikka.craft.capability;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import org.jetbrains.annotations.Nullable;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptHandler;
import org.rikka.craft.script.ScriptManager;

public class ScriptProvider implements ICapabilitySerializable<NBTTagCompound> {

    private IScriptHandler handler = new ScriptHandler();
    private Capability.IStorage<IScriptHandler> storage = ScriptManager.capability.getStorage();

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return ScriptManager.capability.equals(capability);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return ScriptManager.capability.equals(capability) ? (T) handler : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return (NBTTagCompound) storage.writeNBT(ScriptManager.capability, handler, null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        storage.readNBT(ScriptManager.capability, handler, null, nbt);
    }
}
