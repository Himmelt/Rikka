package org.rikka.event.entity.npc;

import org.rikka.entity.IEntity;
import org.rikka.entity.INpc;
import org.rikka.event.EventType;

public class CollideEvent extends CNpcEvent {

    private final IEntity entity;

    CollideEvent(INpc npc, IEntity entity) {
        super(npc, EventType.CNPC_COLLIDE);
        this.entity = entity;
    }

    public IEntity getEntity() {
        return entity;
    }
}
