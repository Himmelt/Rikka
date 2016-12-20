package org.rikka.craft.item;

import org.rikka.RikkaType;
import org.rikka.item.ItemStack;

public class CraftItemStack implements ItemStack {

    private net.minecraft.item.ItemStack itemStack;

    public CraftItemStack(net.minecraft.item.ItemStack itemStack) {
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

    @Override
    public RikkaType type() {
        return RikkaType.ITEMSTACK;
    }
}
