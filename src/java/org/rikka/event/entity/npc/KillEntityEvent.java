package org.rikka.event.entity.npc;

import org.rikka.entity.EntityLivingBase;
import org.rikka.event.Event;

public class KillEntityEvent extends Event {

    public final EntityLivingBase entity;

    KillEntityEvent(Object object, EntityLivingBase entity) {
        super(object);
        this.entity = entity;
    }

}
