package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Illusioner;
import rikka.api.entity.living.monster.IIllusioner;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitIllusioner<T extends Illusioner> extends BukkitLiving<T> implements IIllusioner {
    public BukkitIllusioner(T source) {
        super(source);
    }
}
