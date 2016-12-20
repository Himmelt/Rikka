package org.rikka.craft.entity;

import org.rikka.RikkaType;
import org.rikka.entity.EntityItem;

public class CraftEntityItem<T extends net.minecraft.entity.item.EntityItem> extends CraftEntity<T> implements EntityItem {
    public CraftEntityItem(T entity) {
        super(entity);
    }

    @Override
    public RikkaType type() {
        return RikkaType.ENTITY_ITEM;
    }
}
