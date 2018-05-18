package rikka.bukkit.entity.living;

import org.bukkit.entity.Squid;
import rikka.api.entity.living.ISquid;

public final class BukkitSquid<T extends Squid> extends BukkitLiving<T> implements ISquid {
    public BukkitSquid(T source) {
        super(source);
    }
}
