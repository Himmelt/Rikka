package rikka.sponge.entity.living.golem;

import org.spongepowered.api.entity.living.golem.Shulker;
import rikka.api.entity.living.golem.IShulker;

public class SpongeShulker<T extends Shulker> extends SpongeGolem<T> implements IShulker {
    public SpongeShulker(T source) {
        super(source);
    }
}
