package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Cow;
import rikka.api.entity.living.animal.ICow;
import rikka.sponge.entity.living.SpongeLiving;

public class SpongeCow<T extends Cow> extends SpongeLiving<T> implements ICow {
    public SpongeCow(T source) {
        super(source);
    }
}
