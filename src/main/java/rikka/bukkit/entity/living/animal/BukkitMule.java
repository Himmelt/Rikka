package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Mule;
import org.soraworld.rikka.entity.living.animal.IMule;

public abstract class BukkitMule<T extends Mule> extends BukkitHorse<T> implements IMule {

    public BukkitMule(T source) {
        super(source);
    }

}
