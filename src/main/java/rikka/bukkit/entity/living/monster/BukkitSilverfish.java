package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Silverfish;
import rikka.api.entity.living.monster.ISilverfish;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitSilverfish extends BukkitLiving<Silverfish> implements ISilverfish {
    public BukkitSilverfish(Silverfish source) {
        super(source);
    }
}
