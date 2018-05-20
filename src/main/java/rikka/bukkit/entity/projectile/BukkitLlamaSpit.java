package rikka.bukkit.entity.projectile;

import org.bukkit.entity.LlamaSpit;
import rikka.api.entity.projectile.ILlamaSpit;

public final class BukkitLlamaSpit extends BukkitProjectile<LlamaSpit> implements ILlamaSpit {
    public BukkitLlamaSpit(LlamaSpit source) {
        super(source);
    }
}
