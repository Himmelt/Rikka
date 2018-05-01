package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Horse;
import rikka.api.entity.living.animal.IHorse;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeHorse<T extends Horse> extends SpongeLiving<T> implements IHorse {

    public SpongeHorse(T source) {
        super(source);
    }

}
