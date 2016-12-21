package org.rikka.craft.capability;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import org.rikka.craft.entity.CraftEntity;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.craft.tile.CraftTileEntity;
import org.rikka.craft.world.CraftWorld;

import javax.annotation.Nullable;

public class ScriptProvider implements ICapabilitySerializable<NBTTagCompound> {

    private final IScriptHandler handler;


    public ScriptProvider(CraftEntity entity) {
        handler = entity.getHandler();
    }

    public ScriptProvider(CraftTileEntity tile) {
        handler = tile.getHandler();
    }

    public ScriptProvider(CraftWorld world) {
        handler = world.getHandler();
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
