package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Enderman;
import rikka.api.entity.living.monster.IEnderman;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitEnderman extends BukkitLiving<Enderman> implements IEnderman {
    public BukkitEnderman(Enderman source) {
        super(source);
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
