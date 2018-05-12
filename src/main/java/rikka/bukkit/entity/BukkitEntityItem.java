package rikka.bukkit.entity;

import org.bukkit.entity.Item;
import rikka.api.entity.IEntityItem;
import rikka.api.item.ItemType;

public class BukkitEntityItem<T extends Item> extends BukkitEntity<T> implements IEntityItem {
    public BukkitEntityItem(T source) {
        super(source);
    }

    public ItemType getItemType() {
        return null;
    }
}
