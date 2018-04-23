package org.soraworld.rikka.entity;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.RepresentedItemData;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.item.ItemType;
import org.soraworld.rikka.item.inventory.ItemStackSnapshot;

public interface Item extends Entity {
    default RepresentedItemData getItemData() {
        return get(RepresentedItemData.class).get();
    }

    default Value<ItemStackSnapshot> item() {
        return getValue(Keys.REPRESENTED_ITEM).get();
    }

    default ItemType getItemType() {
        return item().get().getType();
    }
}
