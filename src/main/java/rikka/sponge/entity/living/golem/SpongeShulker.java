package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.Shulker;
import rikka.api.entity.living.golem.IShulker;

public final class SpongeShulker extends SpongeGolem<Shulker> implements IShulker {
    public SpongeShulker(Shulker source) {
        super(source);
    }
}
