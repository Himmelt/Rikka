package org.rikka.event.entity.npc;

import org.rikka.Rikka;
import org.rikka.entity.Entity;
import org.rikka.event.Event;

public class CollideEvent extends Event {

    private final Entity entity;

    CollideEvent(Rikka rikka, Entity entity) {
        super(rikka);
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
