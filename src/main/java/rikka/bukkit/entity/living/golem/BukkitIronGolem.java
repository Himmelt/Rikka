package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.IronGolem;
import rikka.api.entity.living.golem.IIronGolem;

public final class BukkitIronGolem extends BukkitGolem<IronGolem> implements IIronGolem {
    public BukkitIronGolem(IronGolem source) {
        super(source);
    }
}
