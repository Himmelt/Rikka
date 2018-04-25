package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.PigZombie;
import rikka.api.entity.living.monster.IPigZombie;

public abstract class BukkitPigZombie<T extends PigZombie> extends BukkitZombie<T> implements IPigZombie {
    public BukkitPigZombie(T source) {
        super(source);
    }
}
