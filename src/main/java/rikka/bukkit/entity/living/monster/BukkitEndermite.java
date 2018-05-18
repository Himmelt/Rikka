package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Endermite;
import rikka.api.entity.living.monster.IEndermite;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitEndermite<T extends Endermite> extends BukkitLiving<T> implements IEndermite {
    public BukkitEndermite(T source) {
        super(source);
    }
}
