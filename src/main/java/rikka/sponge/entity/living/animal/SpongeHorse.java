package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Horse;
import rikka.api.entity.living.animal.IHorse;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.sponge.entity.living.SpongeLiving;

public class SpongeHorse<T extends Horse> extends SpongeLiving<T> implements IHorse {

    public SpongeHorse(T source) {
        super(source);
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
