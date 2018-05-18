package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Rabbit;
import rikka.api.entity.living.animal.IRabbit;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitRabbit extends BukkitLiving<Rabbit> implements IRabbit {
    public BukkitRabbit(Rabbit source) {
        super(source);
    }
}
