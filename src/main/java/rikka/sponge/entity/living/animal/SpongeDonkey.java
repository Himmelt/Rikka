package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Donkey;
import rikka.api.entity.living.animal.IDonkey;

public abstract class SpongeDonkey<T extends Donkey> extends SpongeHorse<T> implements IDonkey {

    public SpongeDonkey(T source) {
        super(source);
    }

}
