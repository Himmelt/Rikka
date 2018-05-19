package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.arrow.SpectralArrow;
import rikka.api.entity.projectile.ISpectralArrow;

public final class SpongeSpectralArrow extends SpongeArrow<SpectralArrow> implements ISpectralArrow {
    public SpongeSpectralArrow(SpectralArrow source) {
        super(source);
    }
}
