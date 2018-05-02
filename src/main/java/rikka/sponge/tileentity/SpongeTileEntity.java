package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.TileEntity;
import rikka.api.tileentity.ITileEntity;
import rikka.sponge.SpongeRikka;

public abstract class SpongeTileEntity<T extends TileEntity> extends SpongeRikka<T> implements ITileEntity {
    public SpongeTileEntity(T source) {
        super(source);
    }
}
