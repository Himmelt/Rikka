package rikka.bukkit.entity;

import org.bukkit.entity.LeashHitch;
import rikka.api.entity.IEntity;
import rikka.api.entity.ILeashHitch;

public final class BukkitLeashHitch extends BukkitEntity<LeashHitch> implements ILeashHitch {
    public BukkitLeashHitch(LeashHitch source) {
        super(source);
    }

    /* TODO not impl in minecraft & sponge */
    public IEntity getLeashedEntity() {
        return null;
    }
}
