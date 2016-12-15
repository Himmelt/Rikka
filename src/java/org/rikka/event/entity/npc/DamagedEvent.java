package org.rikka.event.entity.npc;

import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import org.rikka.entity.Entity;
import org.rikka.event.Event;

@Cancelable
public class DamagedEvent extends Event {

    public final Entity source;
    public final DamageSource damageSource;
    public float damage;
    public boolean clearTarget = false;

    DamagedEvent(Object object, Entity source, float damage, DamageSource damageSource) {
        super(object);
        this.source = source;
        this.damage = damage;
        this.damageSource = damageSource;
    }
}
