package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.arrow.TippedArrow;
import rikka.api.entity.projectile.ITippedArrow;

public final class SpongeTippedArrow extends SpongeArrow<TippedArrow> implements ITippedArrow {
    public SpongeTippedArrow(TippedArrow source) {
        super(source);
    }
}
