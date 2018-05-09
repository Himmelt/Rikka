package rikka.api.block;

import rikka.api.world.IChunk;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.api.world.biome.BiomeType;

public interface IBlockState {
    byte getMeta();

    void setMeta(byte meta);

    int getX();

    int getY();

    int getZ();

    Location getLocation();

    BlockType getType();

    void setType(BlockType type);

    IChunk getChunk();

    IWorld getWorld();

    BiomeType getBiome();

    void setBiome(BiomeType bio);

    boolean isBlockPowered();

    boolean isEmpty();

    boolean isLiquid();
}
