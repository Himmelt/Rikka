package rikka.bukkit.tileentity;

import org.bukkit.block.Dispenser;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.tileentity.carrier.IDispenser;
import rikka.api.util.math.Vector3d;

public final class BukkitDispenser extends BukkitTileCarrier<Dispenser> implements IDispenser {
    public BukkitDispenser(Dispenser source) {
        super(source);
    }

    public IProjectile launchProjectile(ProjectileType type) {
        return null;
    }

    public IProjectile launchProjectile(ProjectileType type, Vector3d velocity) {
        return null;
    }
}
