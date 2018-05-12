package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Illusioner;
import rikka.api.entity.living.monster.IIllusioner;
import rikka.bukkit.entity.BukkitLiving;

public class BukkitIllusioner<T extends Illusioner> extends BukkitLiving<T> implements IIllusioner {
    public BukkitIllusioner(T source) {
        super(source);
    }
}
