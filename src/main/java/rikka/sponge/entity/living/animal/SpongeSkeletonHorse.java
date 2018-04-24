package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.ISkeletonHorse;
import org.spongepowered.api.entity.living.animal.SkeletonHorse;

public abstract class SpongeSkeletonHorse<T extends SkeletonHorse> extends SpongeHorse<T> implements ISkeletonHorse {

    public SpongeSkeletonHorse(T source) {
        super(source);
    }

}
