package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.WitherSkeleton;
import rikka.api.entity.living.monster.IWitherSkeleton;

public final class BukkitWitherSkeleton<T extends WitherSkeleton> extends BukkitSkeleton<T> implements IWitherSkeleton {
    public BukkitWitherSkeleton(T source) {
        super(source);
    }
}
