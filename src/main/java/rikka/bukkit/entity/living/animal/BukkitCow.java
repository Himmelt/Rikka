package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Cow;
import rikka.api.entity.living.animal.ICow;
import rikka.bukkit.entity.living.BukkitLiving;

public class BukkitCow<T extends Cow> extends BukkitLiving<T> implements ICow {
    public BukkitCow(T source) {
        super(source);
    }
}
