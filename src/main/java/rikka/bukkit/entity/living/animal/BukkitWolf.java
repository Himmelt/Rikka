package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Wolf;
import org.soraworld.rikka.entity.living.animal.IWolf;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitWolf<T extends Wolf> extends BukkitLiving<T> implements IWolf {

    public BukkitWolf(T source) {
        super(source);
    }

}
