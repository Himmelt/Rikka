package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Giant;
import rikka.api.entity.living.monster.IGiant;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeGiant<T extends Giant> extends SpongeLiving<T> implements IGiant {
    public SpongeGiant(T source) {
        super(source);
    }
}
