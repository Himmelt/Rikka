package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.IMooshroom;
import org.spongepowered.api.entity.living.animal.Mooshroom;

public abstract class SpongeMooshroom<T extends Mooshroom> extends SpongeCow<T> implements IMooshroom {

    public SpongeMooshroom(T source) {
        super(source);
    }

}
