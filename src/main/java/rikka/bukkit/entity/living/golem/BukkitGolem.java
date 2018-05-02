package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.Golem;
import rikka.api.entity.living.golem.IGolem;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitGolem<T extends Golem> extends BukkitLiving<T> implements IGolem {
    public BukkitGolem(T source) {
        super(source);
    }
}
