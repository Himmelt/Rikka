package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.SkeletonHorse;
import rikka.api.entity.living.animal.ISkeletonHorse;

public final class BukkitSkeletonHorse extends BukkitHorse<SkeletonHorse> implements ISkeletonHorse {
    public BukkitSkeletonHorse(SkeletonHorse source) {
        super(source);
    }
}
