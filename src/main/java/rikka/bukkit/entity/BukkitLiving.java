package rikka.bukkit.entity;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.ILiving;
import rikka.api.util.math.Vector3d;

public abstract class BukkitLiving<T extends LivingEntity> extends BukkitEntity<T> implements ILiving {

    public BukkitLiving(T source) {
        super(source);
    }

    public double health() {
        return source.getHealth();
    }

    public void setHealth(double health) {
        source.setHealth(health);
    }

    public double maxHealth() {
        return source.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
    }

    public void setMaxHealth(double maxHealth) {
        source.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(maxHealth);
    }

    public IEntity lastAttacker() {
        // TODO
        return null;// source.getLastDamageCause().getCause();
    }

    public double lastDamage() {
        return source.getLastDamage();
    }

    public Vector3d getHeadRotation() {
        // TODO
        return null;
    }

    public void setHeadRotation(Vector3d rotation) {
        // TODO
    }

    public void lookAt(Vector3d target) {
        // TODO
    }

}
