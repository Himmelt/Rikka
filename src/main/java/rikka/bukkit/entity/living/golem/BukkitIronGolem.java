package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.IronGolem;
import rikka.api.entity.living.golem.IIronGolem;

public class BukkitIronGolem<T extends IronGolem> extends BukkitGolem<T> implements IIronGolem {
    public BukkitIronGolem(T source) {
        super(source);
    }
}
