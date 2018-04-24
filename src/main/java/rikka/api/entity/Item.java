package rikka.api.entity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.RepresentedItemData;
import rikka.api.data.value.mutable.Value;
import rikka.api.item.ItemType;
import rikka.api.item.inventory.ItemStackSnapshot;

public interface Item extends IEntity {
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
