package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.SnowGolem;
import rikka.api.entity.living.golem.ISnowGolem;

public abstract class SpongeSnowGolem<T extends SnowGolem> extends SpongeGolem<T> implements ISnowGolem {
    public SpongeSnowGolem(T source) {
        super(source);
    }
}
