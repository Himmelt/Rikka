package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.ZombieHorse;
import rikka.api.entity.living.animal.IZombieHorse;

public class SpongeZombieHorse<T extends ZombieHorse> extends SpongeHorse<T> implements IZombieHorse {
    public SpongeZombieHorse(T source) {
        super(source);
    }
}
