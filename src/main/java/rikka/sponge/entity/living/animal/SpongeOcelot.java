package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Ocelot;
import rikka.api.entity.living.animal.IOcelot;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeOcelot<T extends Ocelot> extends SpongeLiving<T> implements IOcelot {
    public SpongeOcelot(T source) {
        super(source);
    }
}
