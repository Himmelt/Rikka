package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.SkeletonHorse;
import org.soraworld.rikka.entity.living.animal.ISkeletonHorse;

public abstract class BukkitSkeletonHorse<T extends SkeletonHorse> extends BukkitHorse<T> implements ISkeletonHorse {

    public BukkitSkeletonHorse(T source) {
        super(source);
    }

}
