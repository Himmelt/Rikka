package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.ZombieVillager;
import rikka.api.entity.living.monster.IZombieVillager;

public class SpongeZombieVillager<T extends ZombieVillager> extends SpongeZombie<T> implements IZombieVillager {
    public SpongeZombieVillager(T source) {
        super(source);
    }
}
