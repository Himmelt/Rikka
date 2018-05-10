package rikka.bukkit.block;

import org.bukkit.block.Block;
import rikka.api.block.BlockType;
import rikka.api.block.IBlockState;
import rikka.api.world.IChunk;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.api.world.biome.BiomeType;
import rikka.bukkit.BukkitRikka;

public class BukkitBlockState extends BukkitRikka<Block> implements IBlockState {

    public BukkitBlockState(Block source) {
        super(source);
    }

    public Block getSource() {
        return source;
    }

    public byte getMeta() {
        return source.getData();
    }

    public void setMeta(byte meta) {
        source.setData(meta);
    }

    public int getX() {
        return source.getX();
    }

    public int getY() {
        return source.getY();
    }

    public int getZ() {
        return source.getZ();
    }

    public Location getLocation() {
        return new Location(source.getLocation());
    }

    public BlockType getType() {
        // TODO if forge mod block get type ??
        return BlockType.getType(source.getType());
    }

    public void setType(BlockType type) {
        source.setType(type.bukkitType);
    }

    public IChunk getChunk() {
        return null;
    }

    public IWorld getWorld() {
        return getWorld(source.getWorld());
    }

    public BiomeType getBiome() {
        return null;
    }

    public void setBiome(BiomeType bio) {

    }

    public boolean isBlockPowered() {
        return source.isBlockPowered();
    }

    public boolean isEmpty() {
        return source.isEmpty();
    }

    public boolean isLiquid() {
        return source.isLiquid();
    }
}
