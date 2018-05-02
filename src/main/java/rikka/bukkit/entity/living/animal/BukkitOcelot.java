package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Ocelot;
import rikka.api.entity.living.animal.IOcelot;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitOcelot<T extends Ocelot> extends BukkitLiving<T> implements IOcelot {
    public BukkitOcelot(T source) {
        super(source);
    }
}
