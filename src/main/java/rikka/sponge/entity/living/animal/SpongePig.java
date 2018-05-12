package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Pig;
import rikka.api.entity.living.animal.IPig;
import rikka.sponge.entity.SpongeLiving;

public class SpongePig<T extends Pig> extends SpongeLiving<T> implements IPig {
    public SpongePig(T source) {
        super(source);
    }
}
