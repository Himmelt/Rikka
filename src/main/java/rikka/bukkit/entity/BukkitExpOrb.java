package rikka.bukkit.entity;

import org.bukkit.entity.ExperienceOrb;
import rikka.api.entity.IExpOrb;

public final class BukkitExpOrb<T extends ExperienceOrb> extends BukkitEntity<T> implements IExpOrb {
    public BukkitExpOrb(T source) {
        super(source);
    }
}
