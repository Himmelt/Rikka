package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Guardian;
import rikka.api.entity.living.monster.IGuardian;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitGuardian extends BukkitLiving<Guardian> implements IGuardian {
    public BukkitGuardian(Guardian source) {
        super(source);
    }
}
