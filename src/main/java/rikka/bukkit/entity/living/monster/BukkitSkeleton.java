package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Skeleton;
import rikka.api.entity.living.monster.ISkeleton;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitSkeleton<T extends Skeleton> extends BukkitLiving<T> implements ISkeleton {
    public BukkitSkeleton(T source) {
        super(source);
    }
}
