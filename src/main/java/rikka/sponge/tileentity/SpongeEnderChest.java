package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.EnderChest;
import rikka.api.tileentity.IEnderChest;

public final class SpongeEnderChest extends SpongeTileEntity<EnderChest> implements IEnderChest {
    public SpongeEnderChest(EnderChest source) {
        super(source);
    }
}
