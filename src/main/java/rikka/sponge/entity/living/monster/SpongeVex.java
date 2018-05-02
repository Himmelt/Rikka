package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Vex;
import rikka.api.entity.living.monster.IVex;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeVex<T extends Vex> extends SpongeLiving<T> implements IVex {
    public SpongeVex(T source) {
        super(source);
    }
}
