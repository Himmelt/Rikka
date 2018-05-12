package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Husk;
import rikka.api.entity.living.monster.IHusk;

public class SpongeHusk<T extends Husk> extends SpongeZombie<T> implements IHusk {
    public SpongeHusk(T source) {
        super(source);
    }
}
