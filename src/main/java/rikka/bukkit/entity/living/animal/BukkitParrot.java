package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Parrot;
import org.soraworld.rikka.entity.living.animal.IParrot;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitParrot<T extends Parrot> extends BukkitLiving<T> implements IParrot {

    public BukkitParrot(T source) {
        super(source);
    }

}
