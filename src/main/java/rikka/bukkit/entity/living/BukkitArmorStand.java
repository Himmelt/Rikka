package rikka.bukkit.entity.living;

import org.bukkit.entity.ArmorStand;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import rikka.api.entity.living.IArmorStand;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.util.type.HandType;

import javax.annotation.Nullable;

public final class BukkitArmorStand extends BukkitLiving<ArmorStand> implements IArmorStand {
    public BukkitArmorStand(ArmorStand source) {
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
