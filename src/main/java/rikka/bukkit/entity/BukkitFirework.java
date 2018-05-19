package rikka.bukkit.entity;

import org.bukkit.entity.Firework;
import rikka.api.entity.IFirework;

public final class BukkitFirework extends BukkitEntity<Firework> implements IFirework {
    public BukkitFirework(Firework source) {
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
