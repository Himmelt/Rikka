package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.LlamaSpit;
import rikka.api.entity.projectile.ILlamaSpit;

public final class SpongeLlamaSpit extends SpongeProjectile<LlamaSpit> implements ILlamaSpit {
    public SpongeLlamaSpit(LlamaSpit source) {
        super(source);
    }
}
