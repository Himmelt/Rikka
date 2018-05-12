package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Vex;
import rikka.api.entity.living.monster.IVex;
import rikka.bukkit.entity.BukkitLiving;

public class BukkitVex<T extends Vex> extends BukkitLiving<T> implements IVex {
    public BukkitVex(T source) {
        super(source);
    }
}
