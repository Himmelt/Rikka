package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Witch;
import rikka.api.entity.living.monster.IWitch;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitWitch<T extends Witch> extends BukkitLiving<T> implements IWitch {
    public BukkitWitch(T source) {
        super(source);
    }
}
