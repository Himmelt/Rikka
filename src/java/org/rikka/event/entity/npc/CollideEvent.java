package org.rikka.event.entity.npc;

import org.rikka.entity.Entity;
import org.rikka.event.Event;

public class CollideEvent extends Event {

    private final Entity entity;

    CollideEvent(Object object, Entity entity) {
        super(object);
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
