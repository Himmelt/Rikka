package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Vex;
import rikka.api.entity.living.monster.IVex;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitVex<T extends Vex> extends BukkitLiving<T> implements IVex {
    public BukkitVex(T source) {
        super(source);
    }
}
