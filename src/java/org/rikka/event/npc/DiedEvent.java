package org.rikka.event.npc;

import org.rikka.entity.CNpc;
import org.rikka.entity.Entity;

public class DiedEvent extends NpcEvent {

    private final String damageType;
    private final Entity source;
    private final net.minecraft.util.DamageSource damageSource;

    DiedEvent(CNpc npc, Entity source, net.minecraft.util.DamageSource damageSource) {
        super(npc);
        this.damageType = damageSource.damageType;
        this.source = source;
        this.damageSource = damageSource;
    }

    public String getDamageType() {
        return damageType;
    }

    public Entity getSource() {
        return source;
    }

    public net.minecraft.util.DamageSource getDamageSource() {
        return damageSource;
    }
}
