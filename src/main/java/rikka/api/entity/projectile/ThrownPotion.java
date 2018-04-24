package rikka.api.entity.projectile;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.RepresentedItemData;
import rikka.api.data.value.mutable.Value;
import rikka.api.item.inventory.ItemStackSnapshot;

public interface ThrownPotion extends Projectile {
    default RepresentedItemData getPotionItemData() {
        return get(RepresentedItemData.class).get();
    }

    default Value<ItemStackSnapshot> item() {
        return getValue(Keys.REPRESENTED_ITEM).get();
    }
}
