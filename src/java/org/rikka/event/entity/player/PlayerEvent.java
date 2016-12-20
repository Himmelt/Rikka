package org.rikka.event.entity.player;

import org.rikka.entity.IPlayer;
import org.rikka.event.EventType;
import org.rikka.event.REvent;

public class PlayerEvent extends REvent<IPlayer> {

    PlayerEvent(IPlayer rikka, EventType type) {
        super(rikka, type);
    }

    public IPlayer getPlayer() {
        return rikka;
    }

}
