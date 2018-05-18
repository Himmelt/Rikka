package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Guardian;
import rikka.api.entity.living.monster.IGuardian;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitGuardian<T extends Guardian> extends BukkitLiving<T> implements IGuardian {
    public BukkitGuardian(T source) {
        super(source);
    }
}
