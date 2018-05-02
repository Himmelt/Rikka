package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.MushroomCow;
import rikka.api.entity.living.animal.IMooshroom;

public abstract class BukkitMooshroom<T extends MushroomCow> extends BukkitCow<T> implements IMooshroom {
    public BukkitMooshroom(T source) {
        super(source);
    }
}
