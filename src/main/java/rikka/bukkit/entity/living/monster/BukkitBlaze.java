package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Blaze;
import rikka.api.entity.living.monster.IBlaze;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitBlaze<T extends Blaze> extends BukkitLiving<T> implements IBlaze {
    public BukkitBlaze(T source) {
        super(source);
    }
}
