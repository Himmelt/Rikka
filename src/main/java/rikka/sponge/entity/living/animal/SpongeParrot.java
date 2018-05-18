package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Parrot;
import rikka.api.entity.living.animal.IParrot;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeParrot<T extends Parrot> extends SpongeLiving<T> implements IParrot {
    public SpongeParrot(T source) {
        super(source);
    }
}
