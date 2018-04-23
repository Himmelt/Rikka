package org.soraworld.rikka.entity.projectile;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.RepresentedItemData;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.item.inventory.ItemStackSnapshot;

public interface ThrownPotion extends Projectile {
    default RepresentedItemData getPotionItemData() {
        return get(RepresentedItemData.class).get();
    }

    default Value<ItemStackSnapshot> item() {
        return getValue(Keys.REPRESENTED_ITEM).get();
    }
}
