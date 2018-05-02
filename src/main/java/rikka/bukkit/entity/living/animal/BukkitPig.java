package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Pig;
import rikka.api.entity.living.animal.IPig;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitPig<T extends Pig> extends BukkitLiving<T> implements IPig {
    public BukkitPig(T source) {
        super(source);
    }
}
