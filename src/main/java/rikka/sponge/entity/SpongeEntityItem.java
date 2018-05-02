package rikka.sponge.entity;

import org.spongepowered.api.entity.Item;
import rikka.api.entity.IEntityItem;

public abstract class SpongeEntityItem<T extends Item> extends SpongeEntity<T> implements IEntityItem {
    public SpongeEntityItem(T source) {
        super(source);
    }
}
