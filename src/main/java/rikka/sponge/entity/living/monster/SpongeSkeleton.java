package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Skeleton;
import rikka.api.entity.living.monster.ISkeleton;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeSkeleton<T extends Skeleton> extends SpongeLiving<T> implements ISkeleton {
    public SpongeSkeleton(T source) {
        super(source);
    }
}
