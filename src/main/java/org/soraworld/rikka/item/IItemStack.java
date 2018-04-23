package org.soraworld.rikka.item;

import net.minecraft.item.ItemStack;
import org.soraworld.rikka.Rikka;

public interface IItemStack extends Rikka<ItemStack> {

    int getSize();

    void setSize(int size);

}
