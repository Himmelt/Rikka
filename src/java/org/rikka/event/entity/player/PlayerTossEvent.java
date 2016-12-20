package org.rikka.event.entity.player;

import org.rikka.entity.IPlayer;
import org.rikka.event.EventType;
import org.rikka.item.IItemStack;

public class PlayerTossEvent extends PlayerEvent {

    private final IItemStack itemStack;

    public PlayerTossEvent(IPlayer player, IItemStack itemStack) {
        super(player, EventType.PLAYER_TOSS);
        this.itemStack = itemStack;
    }

    public IItemStack getItemStack() {
        return itemStack;
    }

}
