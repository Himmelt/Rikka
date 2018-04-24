package rikka.bukkit.entity;

import org.bukkit.entity.LivingEntity;
import org.soraworld.rikka.entity.living.ILiving;

public abstract class BukkitLiving<T extends LivingEntity> extends BukkitEntity<T> implements ILiving {

    public BukkitLiving(T source) {
        super(source);
    }

}
