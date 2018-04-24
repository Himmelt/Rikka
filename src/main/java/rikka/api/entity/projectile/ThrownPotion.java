package rikka.api.entity.projectile;

import org.soraworld.rikka.item.inventory.ItemStackSnapshot;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.RepresentedItemData;
import rikka.api.data.value.mutable.Value;

public interface ThrownPotion extends Projectile {
    default RepresentedItemData getPotionItemData() {
        return get(RepresentedItemData.class).get();
    }

    default Value<ItemStackSnapshot> item() {
        return getValue(Keys.REPRESENTED_ITEM).get();
    }
}
