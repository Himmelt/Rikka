package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Zombie;
import rikka.api.entity.living.monster.IZombie;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeZombie<T extends Zombie> extends SpongeLiving<T> implements IZombie {
    public SpongeZombie(T source) {
        super(source);
    }
}
