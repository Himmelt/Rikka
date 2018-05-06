package rikka.api.entity;

import rikka.api.data.type.HandType;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.equipment.EquipmentTypes;

import javax.annotation.Nullable;

public interface RArmorEquipable extends IEquipable {

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
