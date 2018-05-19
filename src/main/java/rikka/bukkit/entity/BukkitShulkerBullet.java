package rikka.bukkit.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.ShulkerBullet;
import org.bukkit.projectiles.ProjectileSource;
import rikka.api.entity.IEntity;
import rikka.api.entity.IShulkerBullet;
import rikka.api.entity.living.ILiving;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitShulkerBullet extends BukkitEntity<ShulkerBullet> implements IShulkerBullet {
    public BukkitShulkerBullet(ShulkerBullet source) {
        super(source);
    }

    public ILiving getShooter() {
        ProjectileSource shooter = source.getShooter();
        if (shooter instanceof LivingEntity) return getLiving((LivingEntity) shooter);
        return null;
    }

    public void setShooter(ILiving shooter) {
        if (shooter instanceof BukkitLiving) {
            source.setShooter(((BukkitLiving) shooter).getSource());
        }
    }

    public IEntity getTarget() {
        return getEntity(source.getTarget());
    }

    public void setTarget(IEntity target) {
        if (target instanceof BukkitEntity) {
            source.setTarget(((BukkitEntity) target).getSource());
        }
    }
}
