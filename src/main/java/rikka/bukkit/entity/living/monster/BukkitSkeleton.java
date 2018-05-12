package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Skeleton;
import rikka.api.data.type.HandType;
import rikka.api.entity.living.monster.ISkeleton;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.equipment.EquipmentType;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.bukkit.entity.BukkitLiving;

import javax.annotation.Nullable;

public class BukkitSkeleton<T extends Skeleton> extends BukkitLiving<T> implements ISkeleton {
    public BukkitSkeleton(T source) {
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
