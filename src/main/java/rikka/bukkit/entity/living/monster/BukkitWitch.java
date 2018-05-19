package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Witch;
import rikka.api.entity.living.monster.IWitch;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitWitch extends BukkitLiving<Witch> implements IWitch {
    public BukkitWitch(Witch source) {
        super(source);
    }
}
