package rikka.bukkit.entity.living;

import org.bukkit.entity.Bat;
import rikka.api.entity.living.IBat;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitBat<T extends Bat> extends BukkitLiving<T> implements IBat {

    public BukkitBat(T source) {
        super(source);
    }

}
