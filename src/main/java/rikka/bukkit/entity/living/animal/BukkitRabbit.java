package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Rabbit;
import rikka.api.entity.living.animal.IRabbit;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitRabbit<T extends Rabbit> extends BukkitLiving<T> implements IRabbit {
    public BukkitRabbit(T source) {
        super(source);
    }
}
