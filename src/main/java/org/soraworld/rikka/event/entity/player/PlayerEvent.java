package org.soraworld.rikka.event.entity.player;

import org.rikka.entity.IPlayer;
import org.soraworld.rikka.event.EventType;
import org.soraworld.rikka.event.REvent;

public class PlayerEvent extends REvent<IPlayer> {

    PlayerEvent(IPlayer rikka, EventType type) {
        super(rikka, type);
    }

}
