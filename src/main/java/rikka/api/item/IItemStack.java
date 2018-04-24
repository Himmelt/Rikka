package rikka.api.item;

import net.minecraft.item.ItemStack;
import rikka.api.Rikka;

public interface IItemStack extends Rikka<ItemStack> {

    int getSize();

    void setSize(int size);

}
