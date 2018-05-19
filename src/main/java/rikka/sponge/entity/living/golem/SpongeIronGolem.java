package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.IronGolem;
import rikka.api.entity.living.golem.IIronGolem;

public final class SpongeIronGolem extends SpongeGolem<IronGolem> implements IIronGolem {
    public SpongeIronGolem(IronGolem source) {
        super(source);
    }
}
