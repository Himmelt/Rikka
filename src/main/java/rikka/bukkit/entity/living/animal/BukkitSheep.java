package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Sheep;
import org.soraworld.rikka.entity.living.animal.ISheep;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitSheep<T extends Sheep> extends BukkitLiving<T> implements ISheep {

    public BukkitSheep(T source) {
        super(source);
    }

}
