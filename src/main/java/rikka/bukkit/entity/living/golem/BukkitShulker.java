package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.Shulker;
import rikka.api.entity.living.golem.IShulker;

public final class BukkitShulker extends BukkitGolem<Shulker> implements IShulker {
    public BukkitShulker(Shulker source) {
        super(source);
    }
}
