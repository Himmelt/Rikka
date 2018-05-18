package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.arrow.Arrow;
import rikka.api.entity.projectile.IArrow;

public class SpongeArrow<T extends Arrow> extends SpongeProjectile<T> implements IArrow {
    public SpongeArrow(T source) {
        super(source);
    }
}
