package rikka.bukkit.entity;

import org.bukkit.entity.Entity;
import org.soraworld.rikka.entity.IEntity;

public class BukkitEntity<T extends Entity> implements IEntity {

    protected final T source;

    public BukkitEntity(T source) {
        this.source = source;
    }

}
