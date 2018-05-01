package rikka.bukkit.entity.living;

import org.bukkit.entity.EnderDragon;
import rikka.api.entity.living.complex.IEnderDragon;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitEnderDragon<T extends EnderDragon> extends BukkitLiving<T> implements IEnderDragon {

    public BukkitEnderDragon(T source) {
        super(source);
    }

}
