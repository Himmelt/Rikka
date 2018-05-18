package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Living;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.util.math.Vector3d;
import rikka.sponge.entity.SpongeEntity;

public class SpongeLiving<T extends Living> extends SpongeEntity<T> implements ILiving {

    public SpongeLiving(T source) {
        super(source);
    }

    public double health() {
        return source.health().get();
    }

    public void setHealth(double health) {
        source.health().set(health);
    }

    public double maxHealth() {
        return source.maxHealth().get();
    }

    public void setMaxHealth(double maxHealth) {
        source.maxHealth().set(maxHealth);
    }

    public double lastDamage() {
        return source.lastDamage().or(0D).get();
    }

    public IProjectile launchProjectile(ProjectileType type) {
        return getProjectile(source.launchProjectile(type.spongeClass).orElse(null));
    }

    public IProjectile launchProjectile(ProjectileType type, Vector3d vc) {
        return getProjectile(source.launchProjectile(
                type.spongeClass, new com.flowpowered.math.vector.Vector3d(vc.x, vc.y, vc.z))
                .orElse(null));
    }
}
