package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.ZombieHorse;
import rikka.api.entity.living.animal.IZombieHorse;

public final class BukkitZombieHorse extends BukkitHorse<ZombieHorse> implements IZombieHorse {
    public BukkitZombieHorse(ZombieHorse source) {
        super(source);
    }
}
