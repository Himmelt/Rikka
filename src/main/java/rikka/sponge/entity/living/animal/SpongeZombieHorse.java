package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IZombieHorse;
import org.spongepowered.api.entity.living.animal.ZombieHorse;

public abstract class SpongeZombieHorse<T extends ZombieHorse> extends SpongeHorse<T> implements IZombieHorse {

    public SpongeZombieHorse(T source) {
        super(source);
    }

}
