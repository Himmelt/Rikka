package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.Shulker;
import rikka.api.entity.living.golem.IShulker;

public class BukkitShulker<T extends Shulker> extends BukkitGolem<T> implements IShulker {
    public BukkitShulker(T source) {
        super(source);
    }
}
