package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Vindicator;
import rikka.api.entity.living.monster.IVindicator;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitVindicator<T extends Vindicator> extends BukkitLiving<T> implements IVindicator {
    public BukkitVindicator(T source) {
        super(source);
    }
}
