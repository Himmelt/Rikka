package org.soraworld.rikka.event.entity.npc;

import org.rikka.entity.INpc;
import org.rikka.entity.IPlayer;
import org.soraworld.rikka.event.EventType;

public class InteractEvent extends CNpcEvent {

    public final IPlayer player;

    InteractEvent(INpc npc, IPlayer player) {
        super(npc, EventType.CNPC_INTERACT);
        this.player = player;
    }
}
