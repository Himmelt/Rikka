package org.rikka.event.npc;

import org.rikka.entity.CNpc;
import org.rikka.event.Event;

public abstract class NpcEvent extends Event<CNpc> {

    public NpcEvent(CNpc npc) {
        super(npc);
    }
}
