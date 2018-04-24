package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.ICow;
import org.spongepowered.api.entity.living.animal.Cow;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeCow<T extends Cow> extends SpongeLiving<T> implements ICow {

    public SpongeCow(T source) {
        super(source);
    }

}
