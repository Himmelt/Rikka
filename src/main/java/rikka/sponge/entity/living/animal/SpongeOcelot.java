package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IOcelot;
import org.spongepowered.api.entity.living.animal.Ocelot;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeOcelot<T extends Ocelot> extends SpongeLiving<T> implements IOcelot {

    public SpongeOcelot(T source) {
        super(source);
    }

}
