package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Enderman;
import rikka.api.entity.living.monster.IEnderman;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeEnderman extends SpongeLiving<Enderman> implements IEnderman {
    public SpongeEnderman(Enderman source) {
        super(source);
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }
}
