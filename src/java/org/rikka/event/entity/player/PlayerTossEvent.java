package org.rikka.event.entity.player;

import org.rikka.Rikka;
import org.rikka.event.Event;
import org.rikka.item.ItemStack;

public class PlayerTossEvent extends Event {

    public final ItemStack itemStack;

    public PlayerTossEvent(Rikka rikka, ItemStack itemStack) {
        super(rikka);
        this.itemStack = itemStack;
    }
}
