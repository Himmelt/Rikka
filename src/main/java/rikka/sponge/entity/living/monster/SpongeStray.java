package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Stray;
import rikka.api.entity.living.monster.IStray;

public class SpongeStray<T extends Stray> extends SpongeSkeleton<T> implements IStray {
    public SpongeStray(T source) {
        super(source);
    }
}
