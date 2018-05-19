package rikka.sponge.entity;

import org.spongepowered.api.entity.Item;
import rikka.api.entity.IEntityItem;
import rikka.api.item.ItemType;

public final class SpongeEntityItem extends SpongeEntity<Item> implements IEntityItem {
    public SpongeEntityItem(Item source) {
        super(source);
    }

    public ItemType getItemType() {
        return null;
    }
}
