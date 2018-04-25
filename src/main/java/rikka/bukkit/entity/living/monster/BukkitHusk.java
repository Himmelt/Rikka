package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Husk;
import rikka.api.entity.living.monster.IHusk;

public abstract class BukkitHusk<T extends Husk> extends BukkitZombie<T> implements IHusk {
    public BukkitHusk(T source) {
        super(source);
    }
}
