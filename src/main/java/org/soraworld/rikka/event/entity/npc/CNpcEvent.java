package org.soraworld.rikka.event.entity.npc;

import org.rikka.entity.INpc;
import org.soraworld.rikka.event.EventType;
import org.soraworld.rikka.event.REvent;

public class CNpcEvent extends REvent<INpc> {

    CNpcEvent(INpc npc, EventType type) {
        super(npc, type);
    }

}
