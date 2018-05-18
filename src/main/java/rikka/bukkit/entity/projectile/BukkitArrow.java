package rikka.bukkit.entity.projectile;

import org.bukkit.entity.Arrow;
import rikka.api.entity.projectile.IArrow;

public class BukkitArrow<T extends Arrow> extends BukkitProjectile<T> implements IArrow {
    public BukkitArrow(T source) {
        super(source);
    }
}
