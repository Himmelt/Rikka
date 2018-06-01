package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Dispenser;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.entity.projectile.ProjectileType;
import rikka.api.tileentity.carrier.IDispenser;
import rikka.api.util.math.Vector3d;

public final class SpongeDispenser extends SpongeTileCarrier<Dispenser> implements IDispenser {
    public SpongeDispenser(Dispenser source) {
        super(source);
    }

    public IProjectile launchProjectile(ProjectileType type) {
        return null;
    }

    public IProjectile launchProjectile(ProjectileType type, Vector3d velocity) {
        return null;
    }
}
