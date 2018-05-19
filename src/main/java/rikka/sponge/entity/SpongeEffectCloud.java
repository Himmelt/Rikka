package rikka.sponge.entity;

import org.spongepowered.api.entity.AreaEffectCloud;
import rikka.api.entity.IAreaEffectCloud;

public final class SpongeEffectCloud extends SpongeEntity<AreaEffectCloud> implements IAreaEffectCloud {
    public SpongeEffectCloud(AreaEffectCloud source) {
        super(source);
    }
}
