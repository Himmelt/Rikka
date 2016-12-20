package org.rikka.craft.item;

import net.minecraft.item.ItemStack;
import org.rikka.item.IItemStack;

public class CraftItemStack implements IItemStack {

    private ItemStack itemStack;

    public CraftItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    @Override
    public int getStackSize() {
        return itemStack.stackSize;
    }

    @Override
    public void setStackSize(int size) {
        if (size < 0) {
            size = 1;
        } else if (size > 64) {
            size = 64;
        }
        this.itemStack.stackSize = size;
    }
}
