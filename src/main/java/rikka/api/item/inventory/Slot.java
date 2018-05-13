package rikka.api.item.inventory;

public interface Slot extends IInventory {
    enum Type {
        INVENTORY
    }

    int getStackSize();

    Slot transform(Type type);

    Slot transform();
}
