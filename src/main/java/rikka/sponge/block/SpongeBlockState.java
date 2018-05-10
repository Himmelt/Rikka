package rikka.sponge.block;

import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.world.World;
import rikka.api.block.BlockType;
import rikka.api.block.IBlockState;
import rikka.api.world.IChunk;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.api.world.biome.BiomeType;
import rikka.sponge.SpongeRikka;

public class SpongeBlockState extends SpongeRikka<BlockSnapshot> implements IBlockState {

    public SpongeBlockState(BlockSnapshot source) {
        super(source);
    }

    public BlockSnapshot getSource() {
        return source;
    }

    public byte getMeta() {
        // TODO
        return 0;
    }

    public void setMeta(byte meta) {
        // TODO
    }

    public int getX() {
        return source.getPosition().getX();
    }

    public int getY() {
        return source.getPosition().getY();
    }

    public int getZ() {
        return source.getPosition().getZ();
    }

    public Location getLocation() {
        org.spongepowered.api.world.Location<World> loc = source.getLocation().orElse(null);
        return loc == null ? null : new Location(loc);
    }

    public BlockType getType() {
        // TODO if forge mod block get type ??
        return BlockType.getType(source.getState().getType());
    }

    public void setType(BlockType type) {
        getLocation().setBlockType(type);
    }

    public IChunk getChunk() {
        return null;
    }

    public IWorld getWorld() {
        return getLocation().getWorld();
    }

    public BiomeType getBiome() {
        return null;
    }

    public void setBiome(BiomeType bio) {

    }

    public boolean isBlockPowered() {
        return source.get(Keys.POWERED).orElse(false);
    }

    public boolean isEmpty() {
        return source.getState().getType() == org.spongepowered.api.block.BlockTypes.AIR;
    }

    public boolean isLiquid() {
        // TODO
        return false;
    }
}
