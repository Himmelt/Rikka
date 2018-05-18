package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Parrot;
import rikka.api.entity.living.animal.IParrot;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitParrot extends BukkitLiving<Parrot> implements IParrot {
    public BukkitParrot(Parrot source) {
        super(source);
    }
}
