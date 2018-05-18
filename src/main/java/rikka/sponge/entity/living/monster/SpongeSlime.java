package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Slime;
import rikka.api.entity.living.monster.ISlime;
import rikka.sponge.entity.living.SpongeLiving;

public class SpongeSlime<T extends Slime> extends SpongeLiving<T> implements ISlime {
    public SpongeSlime(T source) {
        super(source);
    }
}
