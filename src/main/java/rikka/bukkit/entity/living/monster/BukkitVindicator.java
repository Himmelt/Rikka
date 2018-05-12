package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Vindicator;
import rikka.api.entity.living.monster.IVindicator;
import rikka.bukkit.entity.BukkitLiving;

public class BukkitVindicator<T extends Vindicator> extends BukkitLiving<T> implements IVindicator {
    public BukkitVindicator(T source) {
        super(source);
    }
}
