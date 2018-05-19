package rikka.sponge.entity;

import org.spongepowered.api.entity.projectile.Firework;
import rikka.api.entity.IFirework;
import rikka.api.entity.api.ProjectileSource;

public final class SpongeFirework extends SpongeEntity<Firework> implements IFirework {
    public SpongeFirework(Firework source) {
        super(source);
    }

    public boolean isPrimed() {
        return false;
    }

    public void prime() {

    }

    public void defuse() {

    }

    public void detonate() {

    }

    // TODO check ???
    public ProjectileSource getShooter() {
        return null;
    }

    // TODO check ???
    public void setShooter(ProjectileSource shooter) {

    }
}
