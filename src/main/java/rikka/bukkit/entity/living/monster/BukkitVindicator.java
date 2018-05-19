package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Vindicator;
import rikka.api.entity.living.monster.IVindicator;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitVindicator extends BukkitLiving<Vindicator> implements IVindicator {
    public BukkitVindicator(Vindicator source) {
        super(source);
    }
}
