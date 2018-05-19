package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Evoker;
import rikka.api.entity.living.monster.IEvoker;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeEvoker extends SpongeLiving<Evoker> implements IEvoker {
    public SpongeEvoker(Evoker source) {
        super(source);
    }
}
