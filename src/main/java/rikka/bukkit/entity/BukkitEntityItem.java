package rikka.bukkit.entity;

import org.bukkit.entity.Item;
import rikka.api.entity.IEntityItem;

public abstract class BukkitEntityItem<T extends Item> extends BukkitEntity<T> implements IEntityItem {
    public BukkitEntityItem(T source) {
        super(source);
    }
}
