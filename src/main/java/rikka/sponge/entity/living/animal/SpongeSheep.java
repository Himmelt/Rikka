package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.ISheep;
import org.spongepowered.api.entity.living.animal.Sheep;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeSheep<T extends Sheep> extends SpongeLiving<T> implements ISheep {

    public SpongeSheep(T source) {
        super(source);
    }

}
