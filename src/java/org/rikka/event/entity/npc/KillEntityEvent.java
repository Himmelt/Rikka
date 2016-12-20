package org.rikka.event.entity.npc;

import org.rikka.Rikka;
import org.rikka.entity.EntityLivingBase;
import org.rikka.event.Event;

public class KillEntityEvent extends Event {

    public final EntityLivingBase entity;

    KillEntityEvent(Rikka rikka, EntityLivingBase entity) {
        super(rikka);
        this.entity = entity;
    }

}
