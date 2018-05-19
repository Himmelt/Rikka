package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.ZombieVillager;
import rikka.api.entity.living.monster.IZombieVillager;

public final class BukkitZombieVillager extends BukkitZombie<ZombieVillager> implements IZombieVillager {
    public BukkitZombieVillager(ZombieVillager source) {
        super(source);
    }
}
