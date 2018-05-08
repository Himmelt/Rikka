package rikka.sponge.item.inventory;

import org.spongepowered.api.item.inventory.Inventory;
import rikka.api.item.inventory.IInventory;
import rikka.sponge.SpongeRikka;

public class SpongeInventory<T extends Inventory> extends SpongeRikka<T> implements IInventory {
    public SpongeInventory(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }
}
