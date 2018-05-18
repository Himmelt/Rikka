package rikka.bukkit.entity.living;

import org.bukkit.entity.Bat;
import rikka.api.entity.living.IBat;

public final class BukkitBat<T extends Bat> extends BukkitLiving<T> implements IBat {
    public BukkitBat(T source) {
        super(source);
    }
}
