package rikka.bukkit.entity;

import org.bukkit.entity.EnderCrystal;
import rikka.api.entity.IEnderCrystal;

public final class BukkitEnderCrystal<T extends EnderCrystal> extends BukkitEntity<T> implements IEnderCrystal {
    public BukkitEnderCrystal(T source) {
        super(source);
    }

    public void detonate() {
        // TODO test in bukkit server
    }
}
