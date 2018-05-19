package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Vindicator;
import rikka.api.entity.living.monster.IVindicator;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeVindicator extends SpongeLiving<Vindicator> implements IVindicator {
    public SpongeVindicator(Vindicator source) {
        super(source);
    }
}
