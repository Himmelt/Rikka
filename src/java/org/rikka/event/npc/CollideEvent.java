package org.rikka.event.npc;

import org.rikka.entity.CustomNpc;
import org.rikka.entity.Entity;

public class CollideEvent extends NpcEvent {

    private final Entity entity;

    CollideEvent(CustomNpc npc, Entity entity) {
        super(npc);
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
