package org.rikka.event.entity.npc;

import net.minecraft.util.DamageSource;
import org.rikka.entity.Entity;
import org.rikka.event.Event;

public class DiedEvent extends Event {

    public final String damageType;
    public final Entity source;
    public final DamageSource damageSource;

    DiedEvent(Object object, Entity source, DamageSource damageSource) {
        super(object);
        this.damageType = damageSource.damageType;
        this.source = source;
        this.damageSource = damageSource;
    }
}
