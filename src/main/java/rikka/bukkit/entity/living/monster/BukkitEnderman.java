package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Enderman;
import rikka.api.entity.living.monster.IEnderman;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitEnderman<T extends Enderman> extends BukkitLiving<T> implements IEnderman {
    public BukkitEnderman(T source) {
        super(source);
    }
}
