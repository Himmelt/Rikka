package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Wolf;
import rikka.api.entity.living.animal.IWolf;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeWolf<T extends Wolf> extends SpongeLiving<T> implements IWolf {
    public SpongeWolf(T source) {
        super(source);
    }
}
