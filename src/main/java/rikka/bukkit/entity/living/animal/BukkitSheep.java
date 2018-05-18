package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Sheep;
import rikka.api.entity.living.animal.ISheep;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitSheep extends BukkitLiving<Sheep> implements ISheep {
    public BukkitSheep(Sheep source) {
        super(source);
    }
}
