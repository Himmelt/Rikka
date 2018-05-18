package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Sheep;
import rikka.api.entity.living.animal.ISheep;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeSheep<T extends Sheep> extends SpongeLiving<T> implements ISheep {
    public SpongeSheep(T source) {
        super(source);
    }
}
