package rikka.bukkit.entity.living;

import org.bukkit.entity.Squid;
import rikka.api.entity.living.ISquid;

public final class BukkitSquid extends BukkitLiving<Squid> implements ISquid {
    public BukkitSquid(Squid source) {
        super(source);
    }
}
