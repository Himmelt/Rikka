package org.rikka.event.npc;

import org.rikka.entity.CNpc;
import org.rikka.entity.Entity;

@net.minecraftforge.fml.common.eventhandler.Cancelable
public class DamagedEvent extends NpcEvent {

    private final Entity source;
    private final net.minecraft.util.DamageSource damageSource;
    private float damage;
    private boolean clearTarget = false;

    DamagedEvent(CNpc npc, Entity source, float damage, net.minecraft.util.DamageSource damageSource) {
        super(npc);
        this.source = source;
        this.damage = damage;
        this.damageSource = damageSource;
    }

    public Entity getSource() {
        return source;
    }

    public net.minecraft.util.DamageSource getDamageSource() {
        return damageSource;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public boolean isClearTarget() {
        return clearTarget;
    }

    public void setClearTarget(boolean clearTarget) {
        this.clearTarget = clearTarget;
    }
}
