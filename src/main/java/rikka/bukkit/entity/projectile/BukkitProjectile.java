package rikka.bukkit.entity.projectile;

import org.bukkit.entity.Projectile;
import rikka.api.entity.projectile.IProjectile;
import rikka.bukkit.entity.BukkitEntity;

public abstract class BukkitProjectile<T extends Projectile> extends BukkitEntity<T> implements IProjectile {
    public BukkitProjectile(T source) {
        super(source);
    }

    public static <P extends IProjectile> P getProjectile(Projectile projectile) {
        return null;
    }
}
