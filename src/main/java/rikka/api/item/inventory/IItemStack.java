package rikka.api.item.inventory;

import rikka.api.item.ItemType;

public interface IItemStack {
    ItemType getType();

    int getQuantity();

    void setQuantity(int quantity) throws IllegalArgumentException;

    int getMaxStackQuantity();

    boolean equalTo(IItemStack that);

    boolean isEmpty();

    IItemStack copy();
}
