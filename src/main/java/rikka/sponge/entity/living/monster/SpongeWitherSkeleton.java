package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Skeleton;
import rikka.api.entity.living.monster.IWitherSkeleton;

public final class SpongeWitherSkeleton<T extends Skeleton> extends SpongeSkeleton<T> implements IWitherSkeleton {
    public SpongeWitherSkeleton(T source) {
        super(source);
    }
}
