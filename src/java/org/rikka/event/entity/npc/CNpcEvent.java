package org.rikka.event.entity.npc;

import org.rikka.entity.INpc;
import org.rikka.event.EventType;
import org.rikka.event.REvent;

public class CNpcEvent extends REvent<INpc> {

    CNpcEvent(INpc npc, EventType type) {
        super(npc, type);
    }

}
