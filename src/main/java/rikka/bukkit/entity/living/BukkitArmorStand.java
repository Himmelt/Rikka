package rikka.bukkit.entity.living;

import org.bukkit.entity.ArmorStand;
import rikka.api.entity.living.IArmorStand;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitArmorStand<T extends ArmorStand> extends BukkitLiving<T> implements IArmorStand {

    public BukkitArmorStand(T source) {
        super(source);
    }

}
