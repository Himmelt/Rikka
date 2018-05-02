package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Vindicator;
import rikka.api.entity.living.monster.IVindicator;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeVindicator<T extends Vindicator> extends SpongeLiving<T> implements IVindicator {
    public SpongeVindicator(T source) {
        super(source);
    }
}
