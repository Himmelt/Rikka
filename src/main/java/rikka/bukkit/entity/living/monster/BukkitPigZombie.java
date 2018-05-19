package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.PigZombie;
import rikka.api.entity.living.monster.IPigZombie;

public final class BukkitPigZombie extends BukkitZombie<PigZombie> implements IPigZombie {
    public BukkitPigZombie(PigZombie source) {
        super(source);
    }
}
