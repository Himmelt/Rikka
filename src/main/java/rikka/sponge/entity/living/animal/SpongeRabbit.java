package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Rabbit;
import rikka.api.entity.living.animal.IRabbit;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeRabbit extends SpongeLiving<Rabbit> implements IRabbit {
    public SpongeRabbit(Rabbit source) {
        super(source);
    }
}
