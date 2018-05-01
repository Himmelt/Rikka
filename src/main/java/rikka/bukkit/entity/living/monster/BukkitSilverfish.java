package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Silverfish;
import rikka.api.entity.living.monster.ISilverfish;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitSilverfish<T extends Silverfish> extends BukkitLiving<T> implements ISilverfish {
    public BukkitSilverfish(T source) {
        super(source);
    }
}