package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Stray;
import rikka.api.entity.living.monster.IStray;

public final class SpongeStray extends SpongeSkeleton<Stray> implements IStray {
    public SpongeStray(Stray source) {
        super(source);
    }
}
