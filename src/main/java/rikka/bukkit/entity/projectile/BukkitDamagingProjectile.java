package rikka.bukkit.entity.projectile;

import org.bukkit.entity.Projectile;
import rikka.api.entity.projectile.IDamagingProjectile;

// TODO check
public class BukkitDamagingProjectile<T extends Projectile> extends BukkitProjectile<T> implements IDamagingProjectile {
    public BukkitDamagingProjectile(T source) {
        super(source);
    }
}
