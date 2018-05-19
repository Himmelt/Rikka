package rikka.sponge.entity;

import org.spongepowered.api.entity.ExperienceOrb;
import rikka.api.entity.IExpOrb;

public final class SpongeExpOrb extends SpongeEntity<ExperienceOrb> implements IExpOrb {
    public SpongeExpOrb(ExperienceOrb source) {
        super(source);
    }
}
