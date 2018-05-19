package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.SnowGolem;
import rikka.api.entity.living.golem.ISnowGolem;

public final class SpongeSnowGolem extends SpongeGolem<SnowGolem> implements ISnowGolem {
    public SpongeSnowGolem(SnowGolem source) {
        super(source);
    }
}
