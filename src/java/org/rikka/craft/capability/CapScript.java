package org.rikka.craft.capability;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import org.jetbrains.annotations.Nullable;
import org.rikka.craft.data.CraftData;
import org.rikka.craft.entity.CraftEntity;
import org.rikka.data.Data;

import java.util.HashMap;

public class CapScript implements ICapabilitySerializable<NBTTagCompound> {

    @CapabilityInject(CapScript.class)
    public static Capability<CapScript> ability;
    public static Capability.IStorage<CapScript> storage = new Capability.IStorage<CapScript>() {

        @Override
        public NBTBase writeNBT(Capability<CapScript> capability, CapScript instance, EnumFacing side) {
            NBTTagCompound compound = new NBTTagCompound();
            NBTTagCompound sData = new NBTTagCompound();

            for (String key : instance.sDataMap.keySet()) {
                Object value = instance.sDataMap.get(key);
                if (value instanceof Number) {
                    sData.setDouble(key, ((Number) value).doubleValue());
                } else if (value instanceof String) {
                    sData.setString(key, (String) value);
                }
            }
            compound.setTag("SData", sData);
            return compound;
        }

        @Override
        public void readNBT(Capability<CapScript> capability, CapScript instance, EnumFacing side, NBTBase nbt) {
            NBTTagCompound sData = ((NBTTagCompound) nbt).getCompoundTag("SData");
            instance.sDataMap.clear();
            for (String key : sData.getKeySet()) {
                NBTBase base = sData.getTag(key);
                instance.sDataMap.put(key, base instanceof NBTPrimitive
                        ? new Double(((NBTPrimitive) base).getDouble()) : ((NBTTagString) base).getString());
            }
        }
    };

    private final HashMap<String, Object> tDataMap = new HashMap<>();
    private final HashMap<String, Object> sDataMap = new HashMap<>();
    private final Data tData = new CraftData(tDataMap);
    private final Data sData = new CraftData(sDataMap);
    private Object object;

    public final Data getTData() {
        return tData;
    }

    public final Data getSData() {
        return sData;
    }

    public final Object getObject() {
        return object;
    }

    public CapScript setObject(Object object) {
        this.object = object;
        return this;
    }

    public static void attachEntity(AttachCapabilitiesEvent<Entity> event) {
        ResourceLocation location = new ResourceLocation("rikka:capScript");
        Entity entity = event.getObject();
        if ((entity instanceof EntityCow || entity instanceof EntityPlayerMP) && !entity.worldObj.isRemote) {
            event.addCapability(location, new CapScript().setObject(new CraftEntity<>(entity)));
        }
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return ability.equals(capability);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return ability.equals(capability) ? (T) this : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return (NBTTagCompound) storage.writeNBT(ability, this, null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        storage.readNBT(ability, this, null, nbt);
    }


}
