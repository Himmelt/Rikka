package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Donkey;
import rikka.api.entity.living.animal.IDonkey;

public final class SpongeDonkey extends SpongeHorse<Donkey> implements IDonkey {
    public SpongeDonkey(Donkey source) {
        super(source);
    }
}
