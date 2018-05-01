package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.PolarBear;
import rikka.api.entity.living.animal.IPolarBear;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitPolarBear<T extends PolarBear> extends BukkitLiving<T> implements IPolarBear {

    public BukkitPolarBear(T source) {
        super(source);
    }

}
