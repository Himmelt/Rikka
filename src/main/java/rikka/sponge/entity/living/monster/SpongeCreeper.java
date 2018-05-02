package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Creeper;
import rikka.api.entity.living.monster.ICreeper;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeCreeper<T extends Creeper> extends SpongeLiving<T> implements ICreeper {
    public SpongeCreeper(T source) {
        super(source);
    }
}
