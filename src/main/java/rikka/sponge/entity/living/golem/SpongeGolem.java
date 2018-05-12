package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.Golem;
import rikka.api.entity.living.golem.IGolem;
import rikka.sponge.entity.SpongeLiving;

public class SpongeGolem<T extends Golem> extends SpongeLiving<T> implements IGolem {
    public SpongeGolem(T source) {
        super(source);
    }
}
