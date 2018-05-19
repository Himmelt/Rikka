package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Mooshroom;
import rikka.api.entity.living.animal.IMooshroom;

public final class SpongeMooshroom extends SpongeCow<Mooshroom> implements IMooshroom {
    public SpongeMooshroom(Mooshroom source) {
        super(source);
    }
}
