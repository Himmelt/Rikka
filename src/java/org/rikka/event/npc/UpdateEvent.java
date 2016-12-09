package org.rikka.event.npc;

import org.rikka.entity.CNpc;

public class UpdateEvent extends NpcEvent {
    UpdateEvent(CNpc npc) {
        super(npc);
    }
}
