package rikka.api.item.inventory;

public interface Slot extends IInventory {
    enum Type {

        /**
         * Slots in an Inventory as opposed to a {@link IContainer}.
         */
        INVENTORY

    }

    int getStackSize();

    Slot transform(Type type);

    Slot transform();
}
