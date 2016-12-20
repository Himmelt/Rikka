package org.rikka.event.entity.npc;

import net.minecraft.util.DamageSource;
import org.rikka.entity.IEntity;
import org.rikka.entity.INpc;
import org.rikka.event.EventType;

public class DamagedEvent extends CNpcEvent {

    private final IEntity source;
    private final DamageSource damageSource;
    private float damage;
    private boolean clearTarget = false;

    DamagedEvent(INpc npc, IEntity source, float damage, DamageSource damageSource) {
        super(npc, EventType.CNPC_DAMAGE);
        this.source = source;
        this.damage = damage;
        this.damageSource = damageSource;
    }

    public IEntity getSource() {
        return source;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
