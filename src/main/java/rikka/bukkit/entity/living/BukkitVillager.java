package rikka.bukkit.entity.living;

import org.bukkit.entity.Villager;
import rikka.api.entity.living.IHumanoid;
import rikka.api.entity.living.IVillager;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;

import javax.annotation.Nullable;

public final class BukkitVillager extends BukkitLiving<Villager> implements IVillager {
    public BukkitVillager(Villager source) {
        super(source);
    }

    public boolean isTrading() {
        return false;
    }

    public IHumanoid getCustomer() {
        return null;
    }

    public void setCustomer(@Nullable IHumanoid humanoid) {

    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
