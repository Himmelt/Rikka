package rikka.sponge.item.inventory;

import org.spongepowered.api.item.inventory.Container;
import rikka.api.item.inventory.IContainer;

public class SpongeContainer extends SpongeInventory<Container> implements IContainer {

    public SpongeContainer(Container source) {
        super(source);
    }

    public Container getSource() {
        return source;
    }

}
