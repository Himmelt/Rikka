package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.SkeletonHorse;
import rikka.api.entity.living.animal.ISkeletonHorse;

public class SpongeSkeletonHorse<T extends SkeletonHorse> extends SpongeHorse<T> implements ISkeletonHorse {
    public SpongeSkeletonHorse(T source) {
        super(source);
    }
}
