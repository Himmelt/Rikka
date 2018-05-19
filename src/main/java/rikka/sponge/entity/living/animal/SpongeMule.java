package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Mule;
import rikka.api.entity.living.animal.IMule;

public final class SpongeMule extends SpongeHorse<Mule> implements IMule {
    public SpongeMule(Mule source) {
        super(source);
    }
}
