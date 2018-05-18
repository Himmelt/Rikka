package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Enderman;
import rikka.api.entity.living.monster.IEnderman;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitEnderman<T extends Enderman> extends BukkitLiving<T> implements IEnderman {
    public BukkitEnderman(T source) {
        super(source);
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
