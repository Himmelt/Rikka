package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Enderman;
import rikka.api.entity.living.monster.IEnderman;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeEnderman<T extends Enderman> extends SpongeLiving<T> implements IEnderman {
    public SpongeEnderman(T source) {
        super(source);
    }
}
