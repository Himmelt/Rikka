package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.ZombieHorse;
import rikka.api.entity.living.animal.IZombieHorse;

public final class SpongeZombieHorse extends SpongeHorse<ZombieHorse> implements IZombieHorse {
    public SpongeZombieHorse(ZombieHorse source) {
        super(source);
    }
}
