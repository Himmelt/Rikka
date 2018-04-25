package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Zombie;
import rikka.api.entity.living.monster.IZombie;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitZombie<T extends Zombie> extends BukkitLiving<T> implements IZombie {
    public BukkitZombie(T source) {
        super(source);
    }
}
