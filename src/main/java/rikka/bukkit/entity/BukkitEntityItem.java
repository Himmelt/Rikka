package rikka.bukkit.entity;

import org.bukkit.entity.Item;
import rikka.api.entity.IEntityItem;
import rikka.api.item.ItemType;

public final class BukkitEntityItem extends BukkitEntity<Item> implements IEntityItem {
    public BukkitEntityItem(Item source) {
        super(source);
    }

    public ItemType getItemType() {
        return null;
    }
}
