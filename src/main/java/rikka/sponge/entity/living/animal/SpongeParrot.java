package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IParrot;
import org.spongepowered.api.entity.living.animal.Parrot;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeParrot<T extends Parrot> extends SpongeLiving<T> implements IParrot {

    public SpongeParrot(T source) {
        super(source);
    }

}
