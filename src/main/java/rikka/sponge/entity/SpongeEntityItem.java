package rikka.sponge.entity;

import org.spongepowered.api.entity.Item;
import rikka.api.entity.IEntityItem;
import rikka.api.item.ItemType;

public class SpongeEntityItem<T extends Item> extends SpongeEntity<T> implements IEntityItem {
    public SpongeEntityItem(T source) {
        super(source);
    }

    public ItemType getItemType() {
        return null;
    }
}
