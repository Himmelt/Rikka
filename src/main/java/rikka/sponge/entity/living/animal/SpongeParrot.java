package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Parrot;
import rikka.api.entity.living.animal.IParrot;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeParrot extends SpongeLiving<Parrot> implements IParrot {
    public SpongeParrot(Parrot source) {
        super(source);
    }
}
