package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Giant;
import rikka.api.entity.living.monster.IGiant;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitGiant<T extends Giant> extends BukkitLiving<T> implements IGiant {
    public BukkitGiant(T source) {
        super(source);
    }
}
