package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Chicken;
import rikka.api.entity.living.animal.IChicken;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeChicken<T extends Chicken> extends SpongeLiving<T> implements IChicken {
    public SpongeChicken(T source) {
        super(source);
    }
}
