package rikka.bukkit.entity.projectile;

import org.bukkit.entity.Projectile;
import rikka.api.entity.api.ProjectileSource;
import rikka.api.entity.projectile.IProjectile;
import rikka.bukkit.entity.BukkitEntity;

public class BukkitProjectile<T extends Projectile> extends BukkitEntity<T> implements IProjectile {
    public BukkitProjectile(T source) {
        super(source);
    }

    public ProjectileSource getShooter() {
        return null;
    }

    public void setShooter(ProjectileSource shooter) {
    }
}
