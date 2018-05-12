package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.EnderChest;
import rikka.api.tileentity.IEnderChest;

public class SpongeEnderChest<T extends EnderChest> extends SpongeTileEntity<T> implements IEnderChest {
    public SpongeEnderChest(T source) {
        super(source);
    }
}
