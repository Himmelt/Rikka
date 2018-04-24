package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IMule;
import org.spongepowered.api.entity.living.animal.Mule;

public abstract class SpongeMule<T extends Mule> extends SpongeHorse<T> implements IMule {

    public SpongeMule(T source) {
        super(source);
    }

}
