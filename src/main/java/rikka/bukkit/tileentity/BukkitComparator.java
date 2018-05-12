package rikka.bukkit.tileentity;

import org.bukkit.block.Comparator;
import rikka.api.tileentity.IComparator;

public class BukkitComparator<T extends Comparator> extends BukkitTileEntity<T> implements IComparator {
    public BukkitComparator(T source) {
        super(source);
    }
}
