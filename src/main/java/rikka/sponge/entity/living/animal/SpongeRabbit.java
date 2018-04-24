package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Rabbit;
import rikka.api.entity.living.animal.IRabbit;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeRabbit<T extends Rabbit> extends SpongeLiving<T> implements IRabbit {

    public SpongeRabbit(T source) {
        super(source);
    }

}
