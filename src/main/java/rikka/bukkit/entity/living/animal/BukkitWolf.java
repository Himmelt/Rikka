package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Wolf;
import rikka.api.entity.living.animal.IWolf;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitWolf extends BukkitLiving<Wolf> implements IWolf {
    public BukkitWolf(Wolf source) {
        super(source);
    }
}
