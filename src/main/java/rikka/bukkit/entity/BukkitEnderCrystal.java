package rikka.bukkit.entity;

import org.bukkit.entity.EnderCrystal;
import rikka.api.entity.IEnderCrystal;

public final class BukkitEnderCrystal extends BukkitEntity<EnderCrystal> implements IEnderCrystal {
    public BukkitEnderCrystal(EnderCrystal source) {
        super(source);
    }

    public void detonate() {
        // TODO test in bukkit server
    }
}
