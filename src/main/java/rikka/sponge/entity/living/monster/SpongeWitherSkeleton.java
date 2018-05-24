package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.WitherSkeleton;
import rikka.api.entity.living.monster.IWitherSkeleton;

public final class SpongeWitherSkeleton extends SpongeSkeleton<WitherSkeleton> implements IWitherSkeleton {
    public SpongeWitherSkeleton(WitherSkeleton source) {
        super(source);
    }
}
