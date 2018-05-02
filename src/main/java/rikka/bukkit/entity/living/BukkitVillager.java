package rikka.bukkit.entity.living;

import org.bukkit.entity.Villager;
import rikka.api.entity.living.IVillager;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitVillager<T extends Villager> extends BukkitLiving<T> implements IVillager {
    public BukkitVillager(T source) {
        super(source);
    }
}
