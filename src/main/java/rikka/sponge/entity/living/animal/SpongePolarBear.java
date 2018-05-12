package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.PolarBear;
import rikka.api.entity.living.animal.IPolarBear;
import rikka.sponge.entity.SpongeLiving;

public class SpongePolarBear<T extends PolarBear> extends SpongeLiving<T> implements IPolarBear {
    public SpongePolarBear(T source) {
        super(source);
    }
}
