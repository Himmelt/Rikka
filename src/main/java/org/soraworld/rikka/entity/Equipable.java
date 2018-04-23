package org.soraworld.rikka.entity;

import org.soraworld.rikka.item.inventory.Carrier;
import org.soraworld.rikka.item.inventory.ItemStack;
import org.soraworld.rikka.item.inventory.equipment.EquipmentType;
import org.soraworld.rikka.util.Identifiable;

import javax.annotation.Nullable;
import java.util.Optional;

public interface Equipable extends Identifiable, Carrier {
    boolean canEquip(EquipmentType type);

    boolean canEquip(EquipmentType type, @Nullable ItemStack equipment);

    Optional<ItemStack> getEquipped(EquipmentType type);

    boolean equip(EquipmentType type, @Nullable ItemStack equipment);
}
