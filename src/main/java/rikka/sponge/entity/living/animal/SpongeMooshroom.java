package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Mooshroom;
import rikka.api.entity.living.animal.IMooshroom;

public abstract class SpongeMooshroom<T extends Mooshroom> extends SpongeCow<T> implements IMooshroom {

    public SpongeMooshroom(T source) {
        super(source);
    }

}
