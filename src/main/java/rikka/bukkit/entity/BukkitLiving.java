package rikka.bukkit.entity;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.util.math.Vector3d;
import rikka.api.world.Location;
import rikka.bukkit.entity.projectile.BukkitProjectile;

public class BukkitLiving<T extends LivingEntity> extends BukkitEntity<T> implements ILiving {

    public BukkitLiving(T source) {
        super(source);
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

    public boolean setLocationSafely(Location location) {
        return false;
    }

    public String getTeamRepresentation() {
        return source.;
    }

    public <P extends IProjectile> P launchProjectile(ProjectileType type) {
        return BukkitProjectile.getProjectile(source.launchProjectile(type.bukkitClass));
    }

    public <P extends IProjectile> P launchProjectile(ProjectileType type, Vector3d vc) {
        return BukkitProjectile.getProjectile(source.launchProjectile(type.bukkitClass, new Vector(vc.x, vc.y, vc.z)));
    }
}
