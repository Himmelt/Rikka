package rikka.api.entity.projectile;

import org.spongepowered.api.entity.projectile.Egg;
import org.spongepowered.api.entity.projectile.Projectile;
import org.spongepowered.api.entity.projectile.arrow.Arrow;

public class ProjectileType {

    public final Class<? extends Projectile> spongeClass;
    public final Class<? extends org.bukkit.entity.Projectile> bukkitClass;

    public static final ProjectileType ARROW;
    public static final ProjectileType EGG;

    static {
        ARROW = new ProjectileType(Arrow.class, org.bukkit.entity.Arrow.class);
        EGG = new ProjectileType(Egg.class, org.bukkit.entity.Egg.class);
    }

    public ProjectileType(Class<? extends Projectile> spongeClass, Class<? extends org.bukkit.entity.Projectile> bukkitClass) {
        this.bukkitClass = bukkitClass;
        this.spongeClass = spongeClass;
    }
}
