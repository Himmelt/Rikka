package org.rikka.event.npc;

import org.rikka.entity.CustomNpc;

public class UpdateEvent extends NpcEvent {
    UpdateEvent(CustomNpc npc) {
        super(npc);
    }
}
