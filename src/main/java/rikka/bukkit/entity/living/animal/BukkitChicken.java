package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Chicken;
import org.soraworld.rikka.entity.living.animal.IChicken;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitChicken<T extends Chicken> extends BukkitLiving<T> implements IChicken {

    public BukkitChicken(T source) {
        super(source);
    }

}
