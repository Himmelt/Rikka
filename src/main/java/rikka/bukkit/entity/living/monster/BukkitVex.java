package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Vex;
import rikka.api.entity.living.monster.IVex;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitVex extends BukkitLiving<Vex> implements IVex {
    public BukkitVex(Vex source) {
        super(source);
    }
}
