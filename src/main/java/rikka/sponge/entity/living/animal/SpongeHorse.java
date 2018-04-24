package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IHorse;
import org.spongepowered.api.entity.living.animal.Horse;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeHorse<T extends Horse> extends SpongeLiving<T> implements IHorse {

    public SpongeHorse(T source) {
        super(source);
    }

}
