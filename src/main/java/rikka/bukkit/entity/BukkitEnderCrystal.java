package rikka.bukkit.entity;

import org.bukkit.entity.EnderCrystal;
import rikka.api.entity.IEnderCrystal;

public abstract class BukkitEnderCrystal<T extends EnderCrystal> extends BukkitEntity<T> implements IEnderCrystal {
    public BukkitEnderCrystal(T source) {
        super(source);
    }
}
