package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Bat;
import rikka.api.entity.living.IBat;

public final class SpongeBat<T extends Bat> extends SpongeLiving<T> implements IBat {
    public SpongeBat(T source) {
        super(source);
    }
}
