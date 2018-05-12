package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.ZombieHorse;
import rikka.api.entity.living.animal.IZombieHorse;

public class BukkitZombieHorse<T extends ZombieHorse> extends BukkitHorse<T> implements IZombieHorse {
    public BukkitZombieHorse(T source) {
        super(source);
    }
}
