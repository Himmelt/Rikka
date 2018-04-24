package rikka.api.entity;

import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.ItemStack;
import rikka.api.item.inventory.equipment.EquipmentType;
import rikka.api.util.Identifiable;

import javax.annotation.Nullable;
import java.util.Optional;

public interface Equipable extends Identifiable, ICarrier {
    boolean canEquip(EquipmentType type);

    boolean canEquip(EquipmentType type, @Nullable ItemStack equipment);

    Optional<ItemStack> getEquipped(EquipmentType type);

    boolean equip(EquipmentType type, @Nullable ItemStack equipment);
}
