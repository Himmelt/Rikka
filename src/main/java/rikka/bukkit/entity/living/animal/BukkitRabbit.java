package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Rabbit;
import org.soraworld.rikka.entity.living.animal.IRabbit;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitRabbit<T extends Rabbit> extends BukkitLiving<T> implements IRabbit {

    public BukkitRabbit(T source) {
        super(source);
    }

}
