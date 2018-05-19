package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Stray;
import rikka.api.entity.living.monster.IStray;

public final class BukkitStray extends BukkitSkeleton<Stray> implements IStray {
    public BukkitStray(Stray source) {
        super(source);
    }
}
