package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Bat;
import rikka.api.entity.living.IBat;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeBat<T extends Bat> extends SpongeLiving<T> implements IBat {
    public SpongeBat(T source) {
        super(source);
    }
}
