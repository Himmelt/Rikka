package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Wolf;
import rikka.api.entity.living.animal.IWolf;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeWolf extends SpongeLiving<Wolf> implements IWolf {
    public SpongeWolf(Wolf source) {
        super(source);
    }
}
