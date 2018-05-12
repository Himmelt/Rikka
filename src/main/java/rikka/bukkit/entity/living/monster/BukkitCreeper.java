package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Creeper;
import rikka.api.entity.living.monster.ICreeper;
import rikka.bukkit.entity.BukkitLiving;

public class BukkitCreeper<T extends Creeper> extends BukkitLiving<T> implements ICreeper {
    public BukkitCreeper(T source) {
        super(source);
    }

    public boolean isPrimed() {
        return false;
    }

    public void prime() {

    }

    public void defuse() {

    }

    public void detonate() {

    }
}
