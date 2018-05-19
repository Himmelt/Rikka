package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Pig;
import rikka.api.entity.living.animal.IPig;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongePig extends SpongeLiving<Pig> implements IPig {
    public SpongePig(Pig source) {
        super(source);
    }
}
