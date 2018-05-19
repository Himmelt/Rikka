package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.PolarBear;
import rikka.api.entity.living.animal.IPolarBear;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongePolarBear extends SpongeLiving<PolarBear> implements IPolarBear {
    public SpongePolarBear(PolarBear source) {
        super(source);
    }
}
