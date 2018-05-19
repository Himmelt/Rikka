package rikka.bukkit.tileentity;

import org.bukkit.block.Comparator;
import rikka.api.tileentity.IComparator;

public final class BukkitComparator extends BukkitTileEntity<Comparator> implements IComparator {
    public BukkitComparator(Comparator source) {
        super(source);
    }
}
