package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Parrot;
import rikka.api.entity.living.animal.IParrot;
import rikka.bukkit.entity.BukkitLiving;

public class BukkitParrot<T extends Parrot> extends BukkitLiving<T> implements IParrot {
    public BukkitParrot(T source) {
        super(source);
    }
}
