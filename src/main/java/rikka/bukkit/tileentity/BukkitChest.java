package rikka.bukkit.tileentity;

import org.bukkit.block.Chest;
import rikka.api.item.inventory.IInventory;
import rikka.api.tileentity.carrier.IChest;

import java.util.Optional;
import java.util.Set;

public final class BukkitChest extends BukkitTileCarrier<Chest> implements IChest {
    public BukkitChest(Chest source) {
        super(source);
    }

    public Optional<IInventory> getDoubleChestInventory() {
        return Optional.empty();
    }

    public Set<IChest> getConnectedChests() {
        return null;
    }
}
