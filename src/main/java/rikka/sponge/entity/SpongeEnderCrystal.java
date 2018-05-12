package rikka.sponge.entity;

import org.spongepowered.api.entity.EnderCrystal;
import rikka.api.entity.IEnderCrystal;

public class SpongeEnderCrystal<T extends EnderCrystal> extends SpongeEntity<T> implements IEnderCrystal {
    public SpongeEnderCrystal(T source) {
        super(source);
    }

    public void detonate() {

    }
}
