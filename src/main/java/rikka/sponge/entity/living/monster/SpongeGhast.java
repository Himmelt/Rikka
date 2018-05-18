package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Ghast;
import rikka.api.entity.living.monster.IGhast;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeGhast<T extends Ghast> extends SpongeLiving<T> implements IGhast {
    public SpongeGhast(T source) {
        super(source);
    }
}
