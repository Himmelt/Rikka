package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.PolarBear;
import rikka.api.entity.living.animal.IPolarBear;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitPolarBear extends BukkitLiving<PolarBear> implements IPolarBear {
    public BukkitPolarBear(PolarBear source) {
        super(source);
    }
}
