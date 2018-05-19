package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Endermite;
import rikka.api.entity.living.monster.IEndermite;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitEndermite extends BukkitLiving<Endermite> implements IEndermite {
    public BukkitEndermite(Endermite source) {
        super(source);
    }
}
