package rikka.sponge.entity;

import org.spongepowered.api.entity.EnderCrystal;
import rikka.api.entity.IEnderCrystal;

public final class SpongeEnderCrystal extends SpongeEntity<EnderCrystal> implements IEnderCrystal {
    public SpongeEnderCrystal(EnderCrystal source) {
        super(source);
    }

    public void detonate() {
    }
}
