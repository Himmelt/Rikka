package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IDonkey;
import org.spongepowered.api.entity.living.animal.Donkey;

public abstract class SpongeDonkey<T extends Donkey> extends SpongeHorse<T> implements IDonkey {

    public SpongeDonkey(T source) {
        super(source);
    }

}
