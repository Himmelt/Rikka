package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Comparator;
import rikka.api.tileentity.IComparator;

public class SpongeComparator<T extends Comparator> extends SpongeTileEntity<T> implements IComparator {
    public SpongeComparator(T source) {
        super(source);
    }
}
