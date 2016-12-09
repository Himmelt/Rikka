package org.rikka.event.npc;

import org.rikka.entity.CNpc;
import org.rikka.entity.EntityLivingBase;

public class KillEntityEvent extends NpcEvent {

    private final EntityLivingBase entity;

    KillEntityEvent(CNpc npc, EntityLivingBase entity) {
        super(npc);
        this.entity = entity;
    }

    public EntityLivingBase getEntity() {
        return entity;
    }
}
