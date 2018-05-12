package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.IronGolem;
import rikka.api.entity.living.golem.IIronGolem;

public class SpongeIronGolem<T extends IronGolem> extends SpongeGolem<T> implements IIronGolem {
    public SpongeIronGolem(T source) {
        super(source);
    }
}
