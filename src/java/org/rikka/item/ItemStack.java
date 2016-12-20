package org.rikka.item;

import org.rikka.Rikka;

public interface ItemStack extends Rikka {

    int getStackSize();

    void setStackSize(int size);
}
