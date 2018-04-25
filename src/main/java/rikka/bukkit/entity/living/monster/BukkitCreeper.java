package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Creeper;
import rikka.api.entity.living.monster.ICreeper;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitCreeper<T extends Creeper> extends BukkitLiving<T> implements ICreeper {
    public BukkitCreeper(T source) {
        super(source);
    }
}
