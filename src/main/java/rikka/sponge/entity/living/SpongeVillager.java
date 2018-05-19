package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Villager;
import rikka.api.entity.living.IHumanoid;
import rikka.api.entity.living.IVillager;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;

import javax.annotation.Nullable;

public final class SpongeVillager extends SpongeLiving<Villager> implements IVillager {
    public SpongeVillager(Villager source) {
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
