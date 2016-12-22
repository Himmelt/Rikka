package org.rikka.item;

import net.minecraft.item.ItemStack;
import org.rikka.Rikka;

public interface IItemStack extends Rikka<ItemStack> {

    int getSize();

    void setSize(int size);

}
