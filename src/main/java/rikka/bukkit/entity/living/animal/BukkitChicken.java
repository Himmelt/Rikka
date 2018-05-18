package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Chicken;
import rikka.api.entity.living.animal.IChicken;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitChicken extends BukkitLiving<Chicken> implements IChicken {
    public BukkitChicken(Chicken source) {
        super(source);
    }
}
