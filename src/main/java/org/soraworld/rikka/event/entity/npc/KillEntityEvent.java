package org.soraworld.rikka.event.entity.npc;

import org.rikka.entity.ILivingBase;
import org.rikka.entity.INpc;
import org.soraworld.rikka.event.EventType;

public class KillEntityEvent extends CNpcEvent {

    public final ILivingBase entity;

    KillEntityEvent(INpc npc, ILivingBase entity) {
        super(npc, EventType.CNPC_KILL);
        this.entity = entity;
    }

}
