package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.arrow.Arrow;
import org.spongepowered.api.entity.projectile.arrow.SpectralArrow;
import rikka.api.entity.projectile.ISpectralArrow;

// TODO SpectralArrow extends Arrow
public final class SpongeSpectralArrow extends SpongeArrow/*<SpectralArrow>*/ implements ISpectralArrow {
    public SpongeSpectralArrow(SpectralArrow source) {
        // TODO remove force trans type
        super((Arrow) source);
    }
}
