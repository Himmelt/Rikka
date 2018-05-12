package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.ZombieVillager;
import rikka.api.entity.living.monster.IZombieVillager;

public class BukkitZombieVillager<T extends ZombieVillager> extends BukkitZombie<T> implements IZombieVillager {
    public BukkitZombieVillager(T source) {
        super(source);
    }
}
