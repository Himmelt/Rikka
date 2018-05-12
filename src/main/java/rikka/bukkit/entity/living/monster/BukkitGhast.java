package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Ghast;
import rikka.api.entity.living.monster.IGhast;
import rikka.bukkit.entity.BukkitLiving;

public class BukkitGhast<T extends Ghast> extends BukkitLiving<T> implements IGhast {
    public BukkitGhast(T source) {
        super(source);
    }
}
