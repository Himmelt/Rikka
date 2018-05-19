package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.ZombiePigman;
import rikka.api.entity.living.monster.IPigZombie;

public final class SpongePigZombie extends SpongeZombie<ZombiePigman> implements IPigZombie {
    public SpongePigZombie(ZombiePigman source) {
        super(source);
    }
}
