package org.rikka.event.entity.player;

import org.rikka.event.Event;
import org.rikka.item.ItemStack;

public class PlayerTossEvent extends Event {

    public final ItemStack itemStack;

    public PlayerTossEvent(Object object, ItemStack itemStack) {
        super(object);
        this.itemStack = itemStack;
    }
}
