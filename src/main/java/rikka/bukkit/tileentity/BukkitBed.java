package rikka.bukkit.tileentity;

import org.bukkit.block.Bed;
import rikka.api.tileentity.IBed;

public class BukkitBed<T extends Bed> extends BukkitTileEntity<T> implements IBed {
    public BukkitBed(T source) {
        super(source);
    }
}
