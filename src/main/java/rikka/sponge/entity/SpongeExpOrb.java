package rikka.sponge.entity;

import org.spongepowered.api.entity.ExperienceOrb;
import rikka.api.entity.IExpOrb;

public class SpongeExpOrb<T extends ExperienceOrb> extends SpongeEntity<T> implements IExpOrb {
    public SpongeExpOrb(T source) {
        super(source);
    }
}
