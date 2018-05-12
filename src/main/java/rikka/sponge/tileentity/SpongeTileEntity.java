package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.TileEntity;
import rikka.api.block.IBlockState;
import rikka.api.tileentity.ITileEntity;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.sponge.SpongeRikka;
import rikka.sponge.block.SpongeBlockState;

public class SpongeTileEntity<T extends TileEntity> extends SpongeRikka<T> implements ITileEntity {

    public SpongeTileEntity(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public boolean isValid() {
        return source.isValid();
    }

    public void setValid(boolean valid) {
        source.setValid(valid);
    }

    public IBlockState getBlock() {
        return new SpongeBlockState(source.getBlock().snapshotFor(source.getLocation()));
    }

    public Location getLocation() {
        return new Location(source.getLocation());
    }

    public IWorld getWorld() {
        return getWorld(source.getWorld());
    }
}
