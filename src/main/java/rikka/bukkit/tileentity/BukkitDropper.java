package rikka.bukkit.tileentity;

import org.bukkit.block.Dropper;
import rikka.api.tileentity.carrier.IDropper;

public final class BukkitDropper extends BukkitTileCarrier<Dropper> implements IDropper {
    public BukkitDropper(Dropper source) {
        super(source);
    }
}
