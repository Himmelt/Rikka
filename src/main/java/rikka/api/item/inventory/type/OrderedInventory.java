package rikka.api.item.inventory.type;

import org.spongepowered.api.item.inventory.property.SlotIndex;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.Slot;

import java.util.Optional;

public interface OrderedInventory extends IInventory {

    Optional<IItemStack> poll(SlotIndex index);

    Optional<IItemStack> poll(SlotIndex index, int limit);

    Optional<IItemStack> peek(SlotIndex index);

    Optional<IItemStack> peek(SlotIndex index, int limit);

    Optional<Slot> getSlot(SlotIndex index);

}
