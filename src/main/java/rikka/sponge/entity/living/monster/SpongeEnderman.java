package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Enderman;
import rikka.api.entity.living.monster.IEnderman;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.sponge.entity.SpongeLiving;

public class SpongeEnderman<T extends Enderman> extends SpongeLiving<T> implements IEnderman {
    public SpongeEnderman(T source) {
        super(source);
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
