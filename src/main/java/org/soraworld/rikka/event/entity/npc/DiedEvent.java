package org.soraworld.rikka.event.entity.npc;

import net.minecraft.util.DamageSource;
import org.rikka.entity.IEntity;
import org.rikka.entity.INpc;
import org.soraworld.rikka.event.EventType;

public class DiedEvent extends CNpcEvent {

    private final String damageType;
    private final IEntity source;
    private final DamageSource damageSource;

    DiedEvent(INpc npc, IEntity source, DamageSource damageSource) {
        super(npc, EventType.CNPC_DIE);
        this.damageType = damageSource.damageType;
        this.source = source;
        this.damageSource = damageSource;
    }

    public IEntity getSource() {
        return source;
    }

    public String getDamageType() {
        return damageType;
    }
}
