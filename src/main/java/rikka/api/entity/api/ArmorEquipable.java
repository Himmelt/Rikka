package rikka.api.entity.api;

import org.spongepowered.api.item.inventory.equipment.EquipmentTypes;
import rikka.api.item.inventory.IItemStack;
import rikka.api.util.type.HandType;

import javax.annotation.Nullable;

public interface ArmorEquipable extends Equipable {

    default IItemStack getHelmet() {
        return this.getEquipped(EquipmentTypes.HEADWEAR);
    }

    default void setHelmet(@Nullable IItemStack helmet) {
        this.equip(EquipmentTypes.HEADWEAR, helmet);
    }

    default IItemStack getChestplate() {
        return this.getEquipped(EquipmentTypes.CHESTPLATE);
    }

    default void setChestplate(@Nullable IItemStack chestplate) {
        this.equip(EquipmentTypes.CHESTPLATE, chestplate);
    }

    default IItemStack getLeggings() {
        return this.getEquipped(EquipmentTypes.LEGGINGS);
    }

    default void setLeggings(@Nullable IItemStack leggings) {
        this.equip(EquipmentTypes.LEGGINGS, leggings);
    }

    default IItemStack getBoots() {
        return this.getEquipped(EquipmentTypes.BOOTS);
    }

    default void setBoots(@Nullable IItemStack boots) {
        this.equip(EquipmentTypes.BOOTS, boots);
    }

    IItemStack getItemInHand(HandType handType);

    void setItemInHand(HandType hand, @Nullable IItemStack itemInHand);

}
