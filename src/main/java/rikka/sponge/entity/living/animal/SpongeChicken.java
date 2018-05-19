package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Chicken;
import rikka.api.entity.living.animal.IChicken;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeChicken extends SpongeLiving<Chicken> implements IChicken {
    public SpongeChicken(Chicken source) {
        super(source);
    }
}
