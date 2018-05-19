package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.WitherSkeleton;
import rikka.api.entity.living.monster.IWitherSkeleton;

public final class BukkitWitherSkeleton extends BukkitSkeleton<WitherSkeleton> implements IWitherSkeleton {
    public BukkitWitherSkeleton(WitherSkeleton source) {
        super(source);
    }
}
