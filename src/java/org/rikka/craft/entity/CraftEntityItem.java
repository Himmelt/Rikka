package org.rikka.craft.entity;

import net.minecraft.entity.item.EntityItem;
import org.rikka.RikkaType;
import org.rikka.entity.IEntityItem;

public class CraftEntityItem<T extends EntityItem> extends CraftEntity<T> implements IEntityItem {
    public CraftEntityItem(T entity) {
        super(entity);
    }

    @Override
    public RikkaType type() {
        return RikkaType.ENTITY_ITEM;
    }
}
