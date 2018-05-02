package rikka.bukkit.entity.living;

import org.bukkit.entity.Squid;
import rikka.api.entity.living.ISquid;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitSquid<T extends Squid> extends BukkitLiving<T> implements ISquid {
    public BukkitSquid(T source) {
        super(source);
    }
}
