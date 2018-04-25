package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Wither;
import rikka.api.entity.living.monster.IWither;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitWither<T extends Wither> extends BukkitLiving<T> implements IWither {
    public BukkitWither(T source) {
        super(source);
    }
}
