package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Illusioner;
import rikka.api.entity.living.monster.IIllusioner;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeIllusioner extends SpongeLiving<Illusioner> implements IIllusioner {
    public SpongeIllusioner(Illusioner source) {
        super(source);
    }
}
