package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Chest;
import rikka.api.item.inventory.IInventory;
import rikka.api.tileentity.carrier.IChest;

import java.util.Optional;
import java.util.Set;

public final class SpongeChest extends SpongeTileCarrier<Chest> implements IChest {
    public SpongeChest(Chest source) {
        super(source);
    }

    public Optional<IInventory> getDoubleChestInventory() {
        return Optional.empty();
    }

    public Set<IChest> getConnectedChests() {
        return null;
    }
}
