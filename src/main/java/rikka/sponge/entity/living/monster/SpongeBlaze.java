package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Blaze;
import rikka.api.entity.living.monster.IBlaze;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeBlaze extends SpongeLiving<Blaze> implements IBlaze {
    public SpongeBlaze(Blaze source) {
        super(source);
    }
}
