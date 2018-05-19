package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.ZombieVillager;
import rikka.api.entity.living.monster.IZombieVillager;

public final class SpongeZombieVillager extends SpongeZombie<ZombieVillager> implements IZombieVillager {
    public SpongeZombieVillager(ZombieVillager source) {
        super(source);
    }
}
