package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Villager;
import rikka.api.entity.living.IVillager;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeVillager<T extends Villager> extends SpongeLiving<T> implements IVillager {
    public SpongeVillager(T source) {
        super(source);
    }
}
