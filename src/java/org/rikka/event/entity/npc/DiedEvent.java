package org.rikka.event.entity.npc;

import net.minecraft.util.DamageSource;
import org.rikka.Rikka;
import org.rikka.entity.Entity;
import org.rikka.event.Event;

public class DiedEvent extends Event {

    public final String damageType;
    public final Entity source;
    public final DamageSource damageSource;

    DiedEvent(Rikka rikka, Entity source, DamageSource damageSource) {
        super(rikka);
        this.damageType = damageSource.damageType;
        this.source = source;
        this.damageSource = damageSource;
    }
}
