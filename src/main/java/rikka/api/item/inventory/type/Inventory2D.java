package rikka.api.item.inventory.type;

import org.spongepowered.api.item.inventory.property.SlotPos;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.Slot;

import java.util.Optional;

public interface Inventory2D extends OrderedInventory {

    Optional<IItemStack> poll(SlotPos pos);

    Optional<IItemStack> poll(SlotPos pos, int limit);

    Optional<IItemStack> peek(SlotPos pos);

    Optional<IItemStack> peek(SlotPos pos, int limit);

    Optional<Slot> getSlot(SlotPos pos);

}
