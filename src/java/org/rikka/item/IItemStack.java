package org.rikka.item;

import net.minecraft.item.ItemStack;

public interface IItemStack {

    int getStackSize();

    void setStackSize(int size);

    ItemStack getOriginal();

}
