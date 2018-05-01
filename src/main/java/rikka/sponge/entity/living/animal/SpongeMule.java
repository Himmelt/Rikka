package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Mule;
import rikka.api.entity.living.animal.IMule;

public abstract class SpongeMule<T extends Mule> extends SpongeHorse<T> implements IMule {

    public SpongeMule(T source) {
        super(source);
    }

}
