package org.rikka.event.npc;

import org.rikka.entity.CNpc;
import org.rikka.entity.Entity;

public class CollideEvent extends NpcEvent {

    private final Entity entity;

    CollideEvent(CNpc npc, Entity entity) {
        super(npc);
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
