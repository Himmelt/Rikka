package rikka.bukkit.entity.living;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.util.math.Vector3d;
import rikka.bukkit.entity.BukkitEntity;
import rikka.bukkit.entity.projectile.BukkitProjectile;

public class BukkitLiving<T extends LivingEntity> extends BukkitEntity<T> implements ILiving {

    public BukkitLiving(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public final double health() {
        return source.getHealth();
    }

    public final void setHealth(double health) {
        source.setHealth(health);
    }

    public final double maxHealth() {
        return source.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
    }

    public final void setMaxHealth(double maxHealth) {
        source.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(maxHealth);
    }

    public final double lastDamage() {
        return source.getLastDamage();
    }

    public BukkitProjectile launchProjectile(ProjectileType type) {
        return getProjectile(source.launchProjectile(type.bukkitClass));
    }

    public BukkitProjectile launchProjectile(ProjectileType type, Vector3d vc) {
        return getProjectile(source.launchProjectile(type.bukkitClass, new Vector(vc.x, vc.y, vc.z)));
    }
}
