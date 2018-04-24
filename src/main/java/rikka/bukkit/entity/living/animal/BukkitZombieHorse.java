package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.ZombieHorse;
import org.soraworld.rikka.entity.living.animal.IZombieHorse;

public abstract class BukkitZombieHorse<T extends ZombieHorse> extends BukkitHorse<T> implements IZombieHorse {

    public BukkitZombieHorse(T source) {
        super(source);
    }

}
