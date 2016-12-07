package org.rikka.event.npc;

import org.rikka.entity.CustomNpc;

public class InitEvent extends NpcEvent{
    InitEvent(CustomNpc npc) {
        super(npc);
    }
}
