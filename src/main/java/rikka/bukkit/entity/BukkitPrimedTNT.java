package rikka.bukkit.entity;

import org.bukkit.entity.TNTPrimed;
import rikka.api.entity.IPrimedTNT;
import rikka.api.entity.living.ILiving;

public final class BukkitPrimedTNT extends BukkitEntity<TNTPrimed> implements IPrimedTNT {

    public BukkitPrimedTNT(TNTPrimed source) {
        super(source);
    }

    public ILiving getDetonator() {
        return null;
    }

    public boolean isPrimed() {
        return !source.isDead();
    }

    public void prime() {
        // TODO test in bukkit server
    }

    public void defuse() {
        // TODO test in bukkit server
    }

    public void detonate() {
        // TODO test in bukkit server
    }
}
