package rikka.sponge.entity;

import org.spongepowered.api.entity.projectile.Firework;
import rikka.api.entity.IFirework;

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

}
