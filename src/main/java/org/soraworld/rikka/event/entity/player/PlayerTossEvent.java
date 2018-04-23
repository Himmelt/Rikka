package org.soraworld.rikka.event.entity.player;

import org.rikka.entity.IPlayer;
import org.rikka.item.IItemStack;
import org.soraworld.rikka.event.EventType;

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
