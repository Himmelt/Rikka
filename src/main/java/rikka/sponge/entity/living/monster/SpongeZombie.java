package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Zombie;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import rikka.api.entity.living.monster.IZombie;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.util.type.HandType;
import rikka.sponge.entity.SpongeLiving;

import javax.annotation.Nullable;

public class SpongeZombie<T extends Zombie> extends SpongeLiving<T> implements IZombie {
    public SpongeZombie(T source) {
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
