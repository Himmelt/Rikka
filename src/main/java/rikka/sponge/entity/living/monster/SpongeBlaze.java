package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Blaze;
import rikka.api.entity.living.monster.IBlaze;
import rikka.sponge.entity.SpongeLiving;

public class SpongeBlaze<T extends Blaze> extends SpongeLiving<T> implements IBlaze {
    public SpongeBlaze(T source) {
        super(source);
    }
}
