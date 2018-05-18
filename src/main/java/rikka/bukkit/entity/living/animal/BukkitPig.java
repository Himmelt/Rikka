package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Pig;
import rikka.api.entity.living.animal.IPig;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitPig extends BukkitLiving<Pig> implements IPig {
    public BukkitPig(Pig source) {
        super(source);
    }
}
