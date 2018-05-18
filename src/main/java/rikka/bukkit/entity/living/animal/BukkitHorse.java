package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.AbstractHorse;
import rikka.api.entity.living.animal.IHorse;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.bukkit.entity.living.BukkitLiving;

public class BukkitHorse<T extends AbstractHorse> extends BukkitLiving<T> implements IHorse {
    public BukkitHorse(T source) {
        super(source);
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
