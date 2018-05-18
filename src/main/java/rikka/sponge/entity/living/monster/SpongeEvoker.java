package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Evoker;
import rikka.api.entity.living.monster.IEvoker;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeEvoker<T extends Evoker> extends SpongeLiving<T> implements IEvoker {
    public SpongeEvoker(T source) {
        super(source);
    }
}
