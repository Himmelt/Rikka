package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.ZombiePigman;
import rikka.api.entity.living.monster.IPigZombie;

public final class SpongePigZombie<T extends ZombiePigman> extends SpongeZombie<T> implements IPigZombie {
    public SpongePigZombie(T source) {
        super(source);
    }
}
