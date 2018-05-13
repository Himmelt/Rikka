package rikka.api.item.inventory;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;
import rikka.api.item.ItemType;

public interface ItemStackSnapshot {

    ItemStackSnapshot NONE = DummyObjectProvider.createFor(ItemStackSnapshot.class, "NONE");

    ItemType getType();

    @Deprecated
    default int getCount() {
        return getQuantity();
    }

    int getQuantity();

    boolean isEmpty();

    IItemStack createStack();

}
