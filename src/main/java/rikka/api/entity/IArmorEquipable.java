package rikka.api.entity;

import rikka.api.data.type.HandType;
import rikka.api.item.inventory.ItemStack;
import rikka.api.item.inventory.equipment.EquipmentTypes;

import javax.annotation.Nullable;

public interface IArmorEquipable extends IEquipable {

    default ItemStack getHelmet() {
        return this.getEquipped(EquipmentTypes.HEADWEAR);
    }

    default void setHelmet(@Nullable ItemStack helmet) {
        this.equip(EquipmentTypes.HEADWEAR, helmet);
    }

    default ItemStack getChestplate() {
        return this.getEquipped(EquipmentTypes.CHESTPLATE);
    }

    default void setChestplate(@Nullable ItemStack chestplate) {
        this.equip(EquipmentTypes.CHESTPLATE, chestplate);
    }

    default ItemStack getLeggings() {
        return this.getEquipped(EquipmentTypes.LEGGINGS);
    }

    default void setLeggings(@Nullable ItemStack leggings) {
        this.equip(EquipmentTypes.LEGGINGS, leggings);
    }

    default ItemStack getBoots() {
        return this.getEquipped(EquipmentTypes.BOOTS);
    }

    default void setBoots(@Nullable ItemStack boots) {
        this.equip(EquipmentTypes.BOOTS, boots);
    }

    ItemStack getItemInHand(HandType handType);

    void setItemInHand(HandType hand, @Nullable ItemStack itemInHand);

}
