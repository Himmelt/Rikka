package rikka.sponge.entity;

import org.spongepowered.api.entity.EnderCrystal;
import rikka.api.entity.IEnderCrystal;

public abstract class SpongeEnderCrystal<T extends EnderCrystal> extends SpongeEntity<T> implements IEnderCrystal {
    public SpongeEnderCrystal(T source) {
        super(source);
    }
}
