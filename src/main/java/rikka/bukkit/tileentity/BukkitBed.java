package rikka.bukkit.tileentity;

import org.bukkit.block.Bed;
import rikka.api.tileentity.IBed;

public final class BukkitBed extends BukkitTileEntity<Bed> implements IBed {
    public BukkitBed(Bed source) {
        super(source);
    }
}
