package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Husk;
import rikka.api.entity.living.monster.IHusk;

public final class SpongeHusk extends SpongeZombie<Husk> implements IHusk {
    public SpongeHusk(Husk source) {
        super(source);
    }
}
