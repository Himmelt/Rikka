package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Mule;
import rikka.api.entity.living.animal.IMule;

public final class BukkitMule extends BukkitHorse<Mule> implements IMule {
    public BukkitMule(Mule source) {
        super(source);
    }
}
