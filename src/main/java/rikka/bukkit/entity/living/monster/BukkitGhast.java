package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Ghast;
import rikka.api.entity.living.monster.IGhast;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitGhast extends BukkitLiving<Ghast> implements IGhast {
    public BukkitGhast(Ghast source) {
        super(source);
    }
}
