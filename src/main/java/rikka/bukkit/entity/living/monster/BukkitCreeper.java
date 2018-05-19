package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Creeper;
import rikka.api.entity.living.monster.ICreeper;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitCreeper extends BukkitLiving<Creeper> implements ICreeper {
    public BukkitCreeper(Creeper source) {
        super(source);
    }

    public boolean isPrimed() {
        return false;
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
