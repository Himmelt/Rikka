package rikka.api.entity;

import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IItemStack;
import rikka.api.util.Identifiable;

import javax.annotation.Nullable;

public interface IEquipable extends Identifiable, ICarrier {

    boolean canEquip(EquipmentType type);

    boolean canEquip(EquipmentType type, @Nullable IItemStack equipment);

    IItemStack getEquipped(EquipmentType type);

    boolean equip(EquipmentType type, @Nullable IItemStack equipment);

}
