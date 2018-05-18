package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Illusioner;
import rikka.api.entity.living.monster.IIllusioner;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeIllusioner<T extends Illusioner> extends SpongeLiving<T> implements IIllusioner {
    public SpongeIllusioner(T source) {
        super(source);
    }
}
