package rikka.sponge.entity;

import net.minecraft.entity.projectile.EntityShulkerBullet;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.ShulkerBullet;
import org.spongepowered.api.entity.living.Living;
import rikka.api.entity.IEntity;
import rikka.api.entity.IShulkerBullet;
import rikka.api.entity.living.ILiving;
import rikka.sponge.entity.living.SpongeLiving;

import java.lang.reflect.Field;

public final class SpongeShulkerBullet extends SpongeEntity<ShulkerBullet> implements IShulkerBullet {

    private static final Field owner;
    private static final Field target;

    static {
        Field field = null;
        try {
            // owner
            field = EntityShulkerBullet.class.getDeclaredField("field_184570_a");
            field.setAccessible(true);
        } catch (Throwable ignored) {
        }
        if (field == null) {
            try {
                // owner
                field = EntityShulkerBullet.class.getDeclaredField("owner");
                field.setAccessible(true);
            } catch (Throwable ignored) {
            }
        }
        owner = field;
        field = null;
        try {
            // target
            field = EntityShulkerBullet.class.getDeclaredField("field_184571_b");
            field.setAccessible(true);
        } catch (Throwable ignored) {
        }
        if (field == null) {
            try {
                // target
                field = EntityShulkerBullet.class.getDeclaredField("target");
                field.setAccessible(true);
            } catch (Throwable ignored) {
            }
        }
        target = field;
    }

    public SpongeShulkerBullet(ShulkerBullet source) {
        super(source);
    }

    public ILiving getShooter() {
        if (owner != null) {
            try {
                Object shooter = owner.get(source);
                if (shooter instanceof Living) return getLiving((Living) shooter);
            } catch (Throwable ignored) {
            }
        }
        return null;
    }

    public void setShooter(ILiving shooter) {
        if (owner != null && shooter instanceof SpongeLiving) {
            try {
                owner.set(source, ((SpongeLiving) shooter).getSource());
            } catch (Throwable ignored) {
            }
        }
    }

    public IEntity getTarget() {
        if (target != null) {
            try {
                Object aim = target.get(source);
                if (aim instanceof Entity) return getEntity((Entity) aim);
            } catch (Throwable ignored) {
            }
        }
        return null;
    }

    public void setTarget(IEntity aim) {
        if (target != null && aim instanceof SpongeEntity) {
            try {
                target.set(source, ((SpongeEntity) aim).getSource());
            } catch (Throwable ignored) {
            }
        }
    }
}
