package rikka.api.item.inventory;

import rikka.api.item.ItemType;
import rikka.api.text.translation.Translatable;

public interface IItemStack extends Translatable {
    ItemType getType();

    int getQuantity();

    void setQuantity(int quantity) throws IllegalArgumentException;

    int getMaxStackQuantity();

    boolean equalTo(IItemStack that);

    boolean isEmpty();

    IItemStack copy();

}
