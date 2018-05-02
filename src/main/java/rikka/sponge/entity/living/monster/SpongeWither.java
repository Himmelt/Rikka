package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Wither;
import rikka.api.entity.living.monster.IWither;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeWither<T extends Wither> extends SpongeLiving<T> implements IWither {
    public SpongeWither(T source) {
        super(source);
    }
}
