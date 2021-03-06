package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Creeper;
import rikka.api.entity.living.monster.ICreeper;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeCreeper extends SpongeLiving<Creeper> implements ICreeper {
    public SpongeCreeper(Creeper source) {
        super(source);
    }

    public boolean isPrimed() {
        return source.isPrimed();
    }

    public void prime() {
        source.prime();
    }

    public void defuse() {
        source.defuse();
    }

    public void detonate() {
        source.detonate();
    }
}
