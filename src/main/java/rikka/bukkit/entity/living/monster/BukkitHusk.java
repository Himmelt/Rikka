package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Husk;
import rikka.api.entity.living.monster.IHusk;

public final class BukkitHusk extends BukkitZombie<Husk> implements IHusk {
    public BukkitHusk(Husk source) {
        super(source);
    }
}
