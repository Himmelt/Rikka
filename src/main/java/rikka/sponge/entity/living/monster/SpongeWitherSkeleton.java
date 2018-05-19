package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Skeleton;
import rikka.api.entity.living.monster.IWitherSkeleton;

public final class SpongeWitherSkeleton extends SpongeSkeleton<Skeleton> implements IWitherSkeleton {
    public SpongeWitherSkeleton(Skeleton source) {
        super(source);
    }
}
