package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Blaze;
import rikka.api.entity.living.monster.IBlaze;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitBlaze extends BukkitLiving<Blaze> implements IBlaze {
    public BukkitBlaze(Blaze source) {
        super(source);
    }
}
