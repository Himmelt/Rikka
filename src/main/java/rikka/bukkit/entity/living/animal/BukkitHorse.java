package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.AbstractHorse;
import org.soraworld.rikka.entity.living.animal.IHorse;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitHorse<T extends AbstractHorse> extends BukkitLiving<T> implements IHorse {

    public BukkitHorse(T source) {
        super(source);
    }

}
