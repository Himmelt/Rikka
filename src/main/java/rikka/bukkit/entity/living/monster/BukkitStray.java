package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Stray;
import rikka.api.entity.living.monster.IStray;

public abstract class BukkitStray<T extends Stray> extends BukkitSkeleton<T> implements IStray {
    public BukkitStray(T source) {
        super(source);
    }
}
