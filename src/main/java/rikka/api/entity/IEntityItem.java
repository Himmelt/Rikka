package rikka.api.entity;

import rikka.api.item.ItemType;

public interface IEntityItem extends IEntity {
    ItemType getItemType();
}
