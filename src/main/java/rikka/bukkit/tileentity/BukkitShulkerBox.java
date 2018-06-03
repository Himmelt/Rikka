package rikka.bukkit.tileentity;

import org.bukkit.block.ShulkerBox;
import rikka.api.tileentity.carrier.IShulkerBox;

public final class BukkitShulkerBox extends BukkitTileCarrier<ShulkerBox> implements IShulkerBox {
    public BukkitShulkerBox(ShulkerBox source) {
        super(source);
    }
}
