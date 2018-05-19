package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Comparator;
import rikka.api.tileentity.IComparator;

public final class SpongeComparator extends SpongeTileEntity<Comparator> implements IComparator {
    public SpongeComparator(Comparator source) {
        super(source);
    }
}
