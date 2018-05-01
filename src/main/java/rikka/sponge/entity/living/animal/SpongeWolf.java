package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Wolf;
import rikka.api.entity.living.animal.IWolf;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeWolf<T extends Wolf> extends SpongeLiving<T> implements IWolf {

    public SpongeWolf(T source) {
        super(source);
    }

}
