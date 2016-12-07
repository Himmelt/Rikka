package org.rikka.event.npc;

import org.rikka.entity.CustomNpc;
import org.rikka.event.Event;

public abstract class NpcEvent extends Event {

    private final CustomNpc npc;

    NpcEvent(CustomNpc npc){
        this.npc = npc;
    }

    public CustomNpc getNpc() {
        return npc;
    }
}
