package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.MushroomCow;
import rikka.api.entity.living.animal.IMooshroom;

public final class BukkitMooshroom extends BukkitCow<MushroomCow> implements IMooshroom {
    public BukkitMooshroom(MushroomCow source) {
        super(source);
    }
}
