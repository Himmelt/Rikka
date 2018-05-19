package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.SkeletonHorse;
import rikka.api.entity.living.animal.ISkeletonHorse;

public final class SpongeSkeletonHorse extends SpongeHorse<SkeletonHorse> implements ISkeletonHorse {
    public SpongeSkeletonHorse(SkeletonHorse source) {
        super(source);
    }
}
