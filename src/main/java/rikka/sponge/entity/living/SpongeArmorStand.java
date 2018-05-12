package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.ArmorStand;
import rikka.api.data.type.HandType;
import rikka.api.entity.living.IArmorStand;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.equipment.EquipmentType;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.sponge.entity.SpongeLiving;

import javax.annotation.Nullable;

public class SpongeArmorStand<T extends ArmorStand> extends SpongeLiving<T> implements IArmorStand {
    public SpongeArmorStand(T source) {
        super(source);
    }

    public IItemStack getItemInHand(HandType handType) {
        return null;
    }

    public void setItemInHand(HandType hand, @Nullable IItemStack itemInHand) {

    }

    public boolean canEquip(EquipmentType type) {
        return false;
    }

    public boolean canEquip(EquipmentType type, @Nullable IItemStack equipment) {
        return false;
    }

    public IItemStack getEquipped(EquipmentType type) {
        return null;
    }

    public boolean equip(EquipmentType type, @Nullable IItemStack equipment) {
        return false;
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
