package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Giant;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import rikka.api.entity.living.monster.IGiant;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.util.type.HandType;
import rikka.bukkit.entity.living.BukkitLiving;

import javax.annotation.Nullable;

public final class BukkitGiant<T extends Giant> extends BukkitLiving<T> implements IGiant {
    public BukkitGiant(T source) {
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
