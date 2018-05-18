package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Ocelot;
import rikka.api.entity.living.animal.IOcelot;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitOcelot extends BukkitLiving<Ocelot> implements IOcelot {
    public BukkitOcelot(Ocelot source) {
        super(source);
    }
}
